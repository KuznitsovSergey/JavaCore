package com.lesson2.task1;
/**
 * 1. Написать программу, вычисляющую сумму цифр введённого
 * *         пользователем целого числа.
 */
public class Summa {

    public static void main(String[] args) {
        System.out.println(summaNumber(1111111111));
    }

    public static int summaNumber(int number) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int k = number % 10;
            sum = k + sum;
            number = number / 10;
        }
        return sum;
    }
}
