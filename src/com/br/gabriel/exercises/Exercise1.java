package com.br.gabriel.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] nomeCategoria = new String[4][2];
        double[][] tempoCompetidor = new double[4][5];
        int[] posicaoRX = new int[2];
        int[] posicaoScale = new int[2];
        int controlRX = 0;
        int controlScale = 0;
        for (int i = 0; i < nomeCategoria.length; i++) {
            System.out.println("Informe o nome do competidor:");
            nomeCategoria[i][0] = sc.nextLine();
            System.out.println("Informe a categoria:");
            nomeCategoria[i][1] = sc.nextLine();
            if(nomeCategoria[i][1].equalsIgnoreCase("rx")) {
                posicaoRX[controlRX] = i;
                controlRX++;
            } else {
                posicaoScale[controlScale] = i;
                controlScale++;
            }

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Informe o tempo de %s na prova %d : ", nomeCategoria[i][0], j + 1);
                tempoCompetidor[i][j] = sc.nextDouble();
            }
        }

//        System.out.println("Posicao RX" + Arrays.toString(posicaoRX));
//        System.out.println("Posicao Scale" + Arrays.toString(posicaoScale));

        double menorTempoRX = 0;
        double somaRX = 0;
        int indiceRX = 0;

        double menorTempoScale = 0;
        double somaScale = 0;
        int indiceScale = 0;

        for (int i = 0; i < (nomeCategoria.length / 2); i++) {
            for (int j = 0; j < 5; j++) {
                somaRX += tempoCompetidor[posicaoRX[i]][j];
                somaScale += tempoCompetidor[posicaoScale[i]][j];
            }
            if(i == 0) {
                indiceRX = posicaoRX[i];
                menorTempoRX = somaRX;

                indiceScale = posicaoScale[i];
                menorTempoScale = somaScale;

            } else if( somaRX < menorTempoRX ) {
                indiceRX = posicaoRX[i];
                menorTempoRX = somaRX;

            } else if( somaScale < menorTempoScale ) {
                indiceScale = posicaoScale[i];
                menorTempoScale = somaScale;
            }
            somaRX = 0;
            somaScale = 0;
        }

        System.out.printf("\nCategoria RX: %s fez o menor tempo no somatório das provas: %.2f minutos \n", nomeCategoria[indiceRX][0], menorTempoRX);
        System.out.printf("Categoria Scale: %s fez o menor tempo no somatório das provas: %.2f minutos \n\n", nomeCategoria[indiceScale][0], menorTempoScale);
        double somaMediaRX = 0;
        double somaMediaScale = 0;
        double menorTempoProva = 0;
        int indiceMenor = 0;
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 2; j++) {
                somaMediaRX += tempoCompetidor[posicaoRX[j]][i];
                somaMediaScale += tempoCompetidor[posicaoScale[j]][i];
            }
            for (int j = 0; j < 4; j++) {
                if(j == 0) {
                    menorTempoProva = tempoCompetidor[j][i];
                    indiceMenor = j;
                } else if (tempoCompetidor[j][i] < menorTempoProva ) {
                    menorTempoProva = tempoCompetidor[j][i];
                    indiceMenor = j;
                }
            }
            System.out.printf("Prova %d: %s fez menor tempo: %.2f minutos\n", i + 1, nomeCategoria[indiceMenor][0], menorTempoProva);
            System.out.printf("Média rx prova %d: %.2f \n", i + 1, somaMediaRX / 2);
            System.out.printf("Média scale prova %d: %.2f \n\n", i + 1, somaMediaScale / 2);
            indiceMenor = 0;
            menorTempoProva = 0;
            somaMediaRX = 0;
            somaMediaScale = 0;
        }
        System.out.println();

        double somaLinha = 0;
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 5; j++) {
                somaLinha += tempoCompetidor[i][j] ;
            }
            System.out.print(nomeCategoria[i][0] + " | " + nomeCategoria[i][1] + " tempo total: " + somaLinha + " minutos");
            System.out.println();
            somaLinha = 0;
        }
    }
}
