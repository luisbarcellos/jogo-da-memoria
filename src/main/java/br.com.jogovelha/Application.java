package br.com.jogovelha;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        char listaLetras[][] = getListaInicial();
        boolean listaOcultarLetras[][] = getListaOcultarLetra();
        int sair = 500;
        int linha;
        int coluna;
        int linha2;
        int coluna2;
        printarLista(listaLetras, listaOcultarLetras);
        Scanner teclado = new Scanner(System.in);

        //Escolhendo a primeira letra
        do{
            boolean escolherLinhaValida = true;
            do {
                System.out.println("\nDigitar o número da linha: ");
                linha = teclado.nextInt();

                System.out.println("\nDigitar o número da coluna: ");
                coluna = teclado.nextInt();

                if(linha > 5 || coluna > 5 || listaOcultarLetras[linha][coluna]) {
                    System.out.println("Linha inválida!");
                } else {
                    escolherLinhaValida = false;
                    //Permitindo que a letra seja visível
                    listaOcultarLetras[linha] [coluna] = true;
                }
            } while (escolherLinhaValida);


            printarLista(listaLetras, listaOcultarLetras);

            //Escolhendo a segunda letra
            boolean escolherLinhaValida2 = true;
            do {
                System.out.println("\nDigitar o número da linha: ");
                linha2 = teclado.nextInt();

                System.out.println("\nDigitar o número da coluna: ");
                coluna2 = teclado.nextInt();

                if(linha2 > 5 || coluna2 > 5 || listaOcultarLetras[linha2][coluna2]) {
                    System.out.println("Linha inválida!");
                } else {
                    escolherLinhaValida2 = false;
                    //Permitindo que a letra seja visível
                    listaOcultarLetras[linha2] [coluna2] = true;
                }
            } while (escolherLinhaValida2);

            printarLista(listaLetras, listaOcultarLetras);

            //Ocultar caso nao acertar
            if(listaLetras[linha][coluna] != listaLetras[linha2][coluna2]) {
                listaOcultarLetras[linha] [coluna] = false;
                listaOcultarLetras[linha2] [coluna2] = false;
                System.out.println("Errou, tente novamente!");
                printarLista(listaLetras, listaOcultarLetras);
            } else {
                System.out.println("Acertou, parabéns!");
            }

            //Valida quando o jogo deve reiniciar
            if (Arrays.deepEquals(listaOcultarLetras, getListaJogoFinalizado())) {
                System.out.println("\nDeseja jogar novamente? Digite S ou N: ");
                String jogarNovamente = teclado.next();
                if(jogarNovamente.equalsIgnoreCase("N")) {
                    sair = 100;
                } else {
                    //Ocultando todas letras
                    listaOcultarLetras = getListaOcultarLetra();
                }
            }
        } while (sair != 100);
    }

    private static char[][] getListaInicial() {
        char listaLetras[][] = new char[6][6];
        listaLetras[0][0] = 'a';
        listaLetras[0][1] = 'a';
        listaLetras[0][2] = 'b';
        listaLetras[0][3] = 'b';
        listaLetras[0][4] = 'c';
        listaLetras[0][5] = 'c';

        listaLetras[1][0] = 'd';
        listaLetras[1][1] = 'd';
        listaLetras[1][2] = 'e';
        listaLetras[1][3] = 'e';
        listaLetras[1][4] = 'f';
        listaLetras[1][5] = 'f';

        listaLetras[2][0] = 'g';
        listaLetras[2][1] = 'g';
        listaLetras[2][2] = 'h';
        listaLetras[2][3] = 'h';
        listaLetras[2][4] = 'i';
        listaLetras[2][5] = 'i';

        listaLetras[3][0] = 'j';
        listaLetras[3][1] = 'j';
        listaLetras[3][2] = 'k';
        listaLetras[3][3] = 'k';
        listaLetras[3][4] = 'l';
        listaLetras[3][5] = 'l';

        listaLetras[4][0] = 'm';
        listaLetras[4][1] = 'm';
        listaLetras[4][2] = 'n';
        listaLetras[4][3] = 'n';
        listaLetras[4][4] = 'o';
        listaLetras[4][5] = 'o';

        listaLetras[5][0] = 'p';
        listaLetras[5][1] = 'p';
        listaLetras[5][2] = 'q';
        listaLetras[5][3] = 'q';
        listaLetras[5][4] = 'r';
        listaLetras[5][5] = 'r';

        return listaLetras;
    }

    private static boolean[][] getListaOcultarLetra() {
        boolean listaLetras[][] = new boolean[6][6];
        listaLetras[0][0] = false;
        listaLetras[0][1] = false;
        listaLetras[0][2] = false;
        listaLetras[0][3] = false;
        listaLetras[0][4] = false;
        listaLetras[0][5] = false;

        listaLetras[1][0] = false;
        listaLetras[1][1] = false;
        listaLetras[1][2] = false;
        listaLetras[1][3] = false;
        listaLetras[1][4] = false;
        listaLetras[1][5] = false;

        listaLetras[2][0] = false;
        listaLetras[2][1] = false;
        listaLetras[2][2] = false;
        listaLetras[2][3] = false;
        listaLetras[2][4] = false;
        listaLetras[2][5] = false;

        listaLetras[3][0] = false;
        listaLetras[3][1] = false;
        listaLetras[3][2] = false;
        listaLetras[3][3] = false;
        listaLetras[3][4] = false;
        listaLetras[3][5] = false;

        listaLetras[4][0] = false;
        listaLetras[4][1] = false;
        listaLetras[4][2] = false;
        listaLetras[4][3] = false;
        listaLetras[4][4] = false;
        listaLetras[4][5] = false;

        listaLetras[5][0] = false;
        listaLetras[5][1] = false;
        listaLetras[5][2] = false;
        listaLetras[5][3] = false;
        listaLetras[5][4] = false;
        listaLetras[5][5] = false;

        return listaLetras;
    }

    private static boolean[][] getListaJogoFinalizado() {
        boolean listaJogoFinalizado[][] = new boolean[6][6];
        listaJogoFinalizado[0][0] = true;
        listaJogoFinalizado[0][1] = true;
        listaJogoFinalizado[0][2] = true;
        listaJogoFinalizado[0][3] = true;
        listaJogoFinalizado[0][4] = true;
        listaJogoFinalizado[0][5] = true;

        listaJogoFinalizado[1][0] = true;
        listaJogoFinalizado[1][1] = true;
        listaJogoFinalizado[1][2] = true;
        listaJogoFinalizado[1][3] = true;
        listaJogoFinalizado[1][4] = true;
        listaJogoFinalizado[1][5] = true;

        listaJogoFinalizado[2][0] = true;
        listaJogoFinalizado[2][1] = true;
        listaJogoFinalizado[2][2] = true;
        listaJogoFinalizado[2][3] = true;
        listaJogoFinalizado[2][4] = true;
        listaJogoFinalizado[2][5] = true;

        listaJogoFinalizado[3][0] = true;
        listaJogoFinalizado[3][1] = true;
        listaJogoFinalizado[3][2] = true;
        listaJogoFinalizado[3][3] = true;
        listaJogoFinalizado[3][4] = true;
        listaJogoFinalizado[3][5] = true;

        listaJogoFinalizado[4][0] = true;
        listaJogoFinalizado[4][1] = true;
        listaJogoFinalizado[4][2] = true;
        listaJogoFinalizado[4][3] = true;
        listaJogoFinalizado[4][4] = true;
        listaJogoFinalizado[4][5] = true;

        listaJogoFinalizado[5][0] = true;
        listaJogoFinalizado[5][1] = true;
        listaJogoFinalizado[5][2] = true;
        listaJogoFinalizado[5][3] = true;
        listaJogoFinalizado[5][4] = true;
        listaJogoFinalizado[5][5] = true;

        return listaJogoFinalizado;
    }

    private static void printarLista(char[] [] listaLetras, boolean[] [] listaOcultarLetras) {
        for (int linha = 0; linha < 6; linha ++) {
            for (int coluna = 0; coluna < 6; coluna ++) {
                if(listaOcultarLetras[linha][coluna]) {
                    System.out.print(listaLetras[linha][coluna] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}