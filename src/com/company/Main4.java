package com.company;

public class Main4 {
    public static void main(String[] args) {
        int N = 5;
        int index = 1;

        int mas[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mas[i][j] = j + i + index;
                if (mas[i][j] > N) {
                    mas[i][j] -= N;
                }

            }

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%-2d", mas[i][j]);
            }
            System.out.println();
        }
    }
}
