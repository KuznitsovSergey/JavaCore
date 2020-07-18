package com.lesson3.task1;

/**
 * * 2. Написать программу, удаляющую все повторяющиеся целые
 * * числа из массива и печатающую результат.
 */
public class IntNumber {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 3, 4, 5, 6, 4, 2};
        intNumberRepeat(mass);
    }

    public static void intNumberRepeat(int[] mass) {
        for (int i = 0; i <= mass.length - 1; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j] && mass[i] % 2 == 0) {
                    mass[j] = 0;
                }
            }
            System.out.print(mass[i]);
        }
    }
}
