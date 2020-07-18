package com.lesson3.task1;

/**
 * * 3. Заданы 2 массива целых чисел произвольной длины. 
 * *     Написать программу, создающую третий массив,
 * * представляющий собой слияние 2-х заданных.
 * * Пример:
 * * 1-й массив: {1, 2, 3, 4, 5}
 * * 2-й массив: {5, 6, 7}
 * * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class Merge {
    public static void main(String[] args) {
        int[] mass1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] mass2 = new int[]{6, 7, 8, 9};
        int[] mass3 = new int[mass1.length + mass2.length];
        allMerger(mass1, mass2, mass3);
    }

    public static void allMerger(int[] mass1, int[] mass2, int[] mass3) {
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i < mass3.length) {
            if (i1 < mass1.length && i2 < mass2.length) {
                mass3[i++] = mass1[i1++];
                mass3[i++] = mass2[i2++];
            } else {
                if (i1 < mass1.length) {
                    mass3[i++] = mass1[i1++];
                } else {
                    mass3[i++] = mass2[i2++];
                }
            }
        }
        for (i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i]);
        }
    }
}
