package br.edu.univas;

public class MultiplicandoMatrizes {
    public static void main(String[] args) {
        int count = 1;
        //criando matrizes
        int[][] matriz = new int[2][3];
        int[][] matriz2 = new int[3][2];


        //enumerando matriz1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = count++;
            }
        }
        //printando matriz1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+".");
            }
            System.out.println();
        }
        //quebra de linha
        System.out.println("");
        count = 1;
        //enumerando matriz2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = count++ * 2;
            }
        }
        //printando matriz2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]+".");
            }
            System.out.println("");
        }
        System.out.println("");
        //condição de que se a quantidade de linhas da matriz1 for igual a quantidade de colunas da linha 0 da matriz2.
        if (matriz.length == matriz2[0].length) {

            //se for true, cria se a matriz3 para armazenar o resultado da multiplicação da matriz1 e da matriz2.
            int[][] matriz3 = new int[matriz.length][matriz2[0].length];

            //o primeiro for para percorrer as linhas da matriz3 e da matriz1
            for(int i=0;i < matriz.length;i++) {

                //segundo for para percorrer a coluna da matriz3 e a coluna da matriz2
                for(int j=0;j < matriz2[0].length;j++) {

                    //terceiro for para percorrer a coluna da matriz1 e da linha da matriz2
                    for(int k=0;k < matriz2.length;k++) {
                        matriz3[i][j] += matriz[i][k] * matriz2[k][j];
                    }
                }
            }
            //printando matriz3
            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    System.out.print(matriz3[i][j]+".");
                }
                System.out.println();
            }
        }

        }
    }


