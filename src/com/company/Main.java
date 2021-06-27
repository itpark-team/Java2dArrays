package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int countWorkers = 5;
        int countMonth = 12;
        int salaries[][] = new int[countWorkers][countMonth];
        int sumSalaries[] = new int[countWorkers];

        Random random = new Random();

        for (int i = 0; i < countWorkers; i++) {
            for (int j = 0; j < countMonth; j++) {
                salaries[i][j] = random.nextInt(99) + 1;
            }
        }

        for (int i = 0; i < countWorkers; i++) {
            for (int j = 0; j < countMonth; j++) {
                System.out.printf("%-5d", salaries[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < countWorkers; i++) {
            sumSalaries[i] = 0;
        }

        for (int i = 0; i < countWorkers; i++) {
            for (int j = 0; j < countMonth; j++) {
                sumSalaries[i] += salaries[i][j];
            }
        }

        for (int i = 0; i < countWorkers; i++) {
            System.out.printf("%-5d", sumSalaries[i]);
        }
        System.out.println();

        boolean isSort;
        int temp;
        int offset = 0;

        do {
            isSort = true;

            for (int i = 0; i < countWorkers - 1 - offset; i++) {
                if (sumSalaries[i + 1] < sumSalaries[i]) {
                    //change sum elements
                    isSort = false;

                    temp = sumSalaries[i + 1];
                    sumSalaries[i + 1] = sumSalaries[i];
                    sumSalaries[i] = temp;

                    //change string elements

                    for (int j = 0; j < countMonth; j++) {
                        temp = salaries[i + 1][j];
                        salaries[i + 1][j] = salaries[i][j];
                        salaries[i][j] = temp;
                    }
                }
            }

            offset++;

        } while (isSort == false);


        System.out.println("---------");

        for (int i = 0; i < countWorkers; i++) {
            for (int j = 0; j < countMonth; j++) {
                System.out.printf("%-5d", salaries[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < countWorkers; i++) {
            System.out.printf("%-5d", sumSalaries[i]);
        }
        System.out.println();

    }
}
