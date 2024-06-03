import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private char jogadorAtual;
    private Scanner scanner;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        jogadorAtual = 'X';
        scanner = new Scanner(System.in);

    }

    public void iniciarJogo() {
        while (true) {
            tabuleiro.imprimirTabuleiro();
            System.out.println("Vez do jogador: " + jogadorAtual);

            int linha, coluna;
            do {
                System.out.print("Digite a linha (1-3): ");
                //Scanner scanner = null;
                linha = scanner.nextInt() - 1;
                System.out.print("Digite a coluna (1-3): ");
                coluna = scanner.nextInt() - 1;
            } while (!tabuleiro.fazerJogada(linha, coluna, jogadorAtual));

            char vencedor = tabuleiro.verificarVencedor();
            if (vencedor != ' ') {
                tabuleiro.imprimirTabuleiro();
                if (vencedor == 'E') {
                    System.out.println("Empate!");
                } else {
                    System.out.println("O jogador " + vencedor + " venceu!");
                }
                break;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }
}