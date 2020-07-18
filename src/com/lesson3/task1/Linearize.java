package com.lesson3.task1;

/**
 * 4. Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class Linearize {
    public static void main(String[] args) {
        int[][] mass1 = new int[][]{
                {1, 2},
                {4, 5, 6},
                {7, 8, 9, 4},
                {4, 5, 6, 9},
                {1}
        };
        int lengthMass1 = 0;
        for (int i = 0; i < mass1.length; i++) {
            lengthMass1 = mass1.length + lengthMass1;
        }
        int[] mass2 = new int[lengthMass1];
        resultLinearize(mass1, mass2);

    }
    public static void resultLinearize(int[][] mass1, int[] mass2) {
        int temp = 0;
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1[i].length; j++) {
                mass2[temp] = mass1[i][j];
                temp++;
            }
        }
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i]);
        }
    }
}
