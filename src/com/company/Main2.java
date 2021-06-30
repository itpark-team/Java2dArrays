package com.company;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int countRows = 3;
        int countColumns = 4;
        int mas[][] = new int[countRows][countColumns];
        Random random = new Random();

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                mas[i][j] = random.nextInt(100);
            }
        }


        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                System.out.printf("%-5d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----");

        for (int j = 0; j < countColumns; j++) {
            for (int i = 0; i < countRows; i++) {
                System.out.printf("%-5d", mas[i][j]);
            }
            System.out.println();
        }
    }
}
