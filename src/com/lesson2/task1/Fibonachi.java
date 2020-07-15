package com.lesson2.task1;
/**
 * 2. Написать программу, вычисляющую и отображающую все числа
 * * Фибоначчи меньше введённого пользователем целого числа.
 * *     Решить двумя способами: с помощью цикла и с помощью
 * * рекурсии.
 */
public class Fibonachi {

    public static void main(String[] args) {
        fibonachiNumber(2584);
    }

    public static void fibonachiNumber(int number) {
        int x = 0;
        int y = 1;
        int k = 0;
        for (int i = 0; k < number; i++) {
            k = x;
            x = y + x;
            y = k;
            System.out.println(k);
        }
    }
}
