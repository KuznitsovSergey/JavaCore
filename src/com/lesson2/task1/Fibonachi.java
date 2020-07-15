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
        int temp = 0;
        for (int i = 0; temp < number; i++) {
            temp = x;
            x = y + x;
            y = temp;
            System.out.println(y);
        }
    }
}
