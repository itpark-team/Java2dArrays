package com.company;

public class Main3 {
    public static void main(String[] args) {
        int N = 7;
        int M = 7;
        int mas[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ((i + j) % 2 == 0) {
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%-2d", mas[i][j]);
            }
            System.out.println();
        }
    }
}
