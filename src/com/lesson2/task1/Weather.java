package com.lesson2.task1;

/**
 * 3. Написать программу, отображающую статистику по осадкам за N дней.
 * N вводится пользователем.
 * Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *      Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 */
public class Weather {

    public static void main(String[] args) {
        int countDay = 5;
        int number = 100;
        int sum = 0;
        int max = 0;
        for (int i = 1; i <= countDay; i++) {
            int randomWeatherDay = i + (int) (Math.random() * number);
            System.out.println(i + "-й день колличество осадков: " + randomWeatherDay);
            int temp = randomWeatherDay;
            sum = sum + temp;
            if (randomWeatherDay > max) {
                max = randomWeatherDay;
            }
        }
        System.out.println("Сумма осадков за " + countDay + " дней = " + sum);
        System.out.println("Среднее колличество осадков за " + countDay + " дней = " + sum / countDay);
        System.out.println("Максимальное количество дневных осадков = " + max);
    }
}
