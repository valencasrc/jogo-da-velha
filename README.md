# jogo-da-velha

Jogo da Velha em Java
Introdução
Este repositório contém o código-fonte de um jogo da velha em Java. O jogo é implementado como uma classe Jogo que contém a lógica do jogo, bem como uma classe Tabuleiro que representa o tabuleiro do jogo. O jogo pode ser jogado contra o computador ou contra outro jogador humano.

Instalação
Para instalar o jogo, você precisará ter o Java Development Kit (JDK) instalado em seu sistema. Você pode baixar o JDK no site oficial da Oracle: https://www.oracle.com/java/technologies/downloads/.

Depois de instalar o JDK, você pode compilar o jogo executando o seguinte comando no terminal:

Copiar
javac Jogo.java Tabuleiro.java
Isso criará dois arquivos de classe, Jogo.class e Tabuleiro.class.

Como jogar
Para jogar o jogo, você pode executar o seguinte comando no terminal:

Copiar
java Jogo
Isso iniciará o jogo e você será solicitado a digitar a linha e a coluna onde deseja fazer sua jogada. O jogador que conseguir fazer três símbolos em linha, coluna ou diagonal primeiro vence o jogo. Se o tabuleiro ficar cheio e nenhum jogador conseguir fazer três símbolos em linha, o jogo termina empatado.

Opções
O jogo da velha em Java oferece as seguintes opções:

Jogar contra o computador ou contra outro jogador humano.
Escolher o símbolo do jogador (X ou O).
Jogar em modo de linha de comando ou em modo gráfico (opcional).
Modo gráfico (opcional)
O jogo da velha em Java também pode ser jogado em modo gráfico. Para isso, você precisará ter a biblioteca JavaFX instalada em seu sistema. Você pode baixar a biblioteca JavaFX no site oficial da Oracle: https://www.oracle.com/java/technologies/javase/javase-jfxtutorial.html.

Depois de instalar a biblioteca JavaFX, você pode compilar o jogo em modo gráfico executando o seguinte comando no terminal:

Copiar
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml Jogo.java Tabuleiro.java
Isso criará um arquivo JAR executável, jogo-da-velha.jar. Você pode executar o jogo em modo gráfico clicando duas vezes no arquivo JAR.

Licença
Este jogo da velha em Java é licenciado sob a licença MIT. Isso significa que você pode usar, modificar e distribuir o código-fonte do jogo para qualquer finalidade, comercial ou não comercial.

