package com.lesson3.task1;
/**
 * 1. Напишите программу, которая циклически сдвигает элементы
 * * массива вправо на одну позицию, и печатает результат.
 * * Цикличность означает, что последний элемент массива становится
 * * самым первым его элементом.
 */
public class Сhange {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < mass.length; i++) {
            massChange(mass);
        }
    }

    public static void massChange(int[] mass) {
        for (int i = 0; i <= mass.length - 1; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - 1];
            mass[mass.length - 1] = temp;
        }
        System.out.print(" ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }
    }
}
