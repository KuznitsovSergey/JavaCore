package com.lesson1.task;

import static java.lang.Math.sqrt;

/**
 * 1. Имеются три числа - день, месяц и год, вводимые пользователем с
 * консоли.
 *     Вывести дату следующего дня в формате &quot; День.Месяц.Год&quot;.
 *     Учесть переход на следующий месяц, а также следующий год.
 *     Форматирование строки &quot;День.Месяц.Год&quot; вынести в отдельную
 * функцию.
 * год не високосный в соответствии с григорианским календарем, год является високосным,
 * если его номер кратен 4, но не кратен 100, а также если он кратен 400.
 * если високосный в феврале 29 дней иначе 28
 * 1.	Январь	31
 * 2.	Февраль	28 / 29
 * 3.	Март	31
 * 4.	Апрель	30
 * 5.	Май		31
 * 6.	Июнь	30
 * 7.	Июль	31
 * 8.	Август	31
 * 9.	Сентябрь30
 * 10.	Октябрь	31
 * 11.	Ноябрь	30
 * 12.	Декабрь	31
 * <p>
 * int day = 29, months = 2, year = 2020;
 */
public class DayEndFunction {
    public static void main(String[] args) {

        nextDay(31, 12, 2020);

        int a = 1;
        int b = 3;
        int c = 1;
        System.out.println("дискриминант = " + discriminant(a, b, c));
        discriminant(a, b, c);
        isPositive(a, b, c);
        isZero(a, b, c);
        function(a, b, c);

    }

    public static void nextDay(int day, int months, int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && months == 2) {
            if (day > 29) {
                System.out.println("В этом месяце только 29 дней, введите правильную дату");
            } else {
                if (day == 29) {
                    day = 0;
                    months++;
                }
            }
        } else {
            if (day > 28 && months == 2) {
                System.out.println("В этом месяце только 28 дней, введите правильную дату");
            } else {
                if (day == 28 && months == 2) {
                    months++;
                    day = 0;
                }
            }
        }
        if (day > 30 && (months == 4 || months == 6 || months == 9 || months == 11)) {
            System.out.println("В этом месяце не больше 30 дней, введите правильную дату");
        } else {
            if (day == 30 && (months == 4 || months == 6 || months == 9 || months == 11)) {
                months++;
                day = 1;
            } else {
                if (day > 31) {
                    System.out.println("В этом месяце не больше 31 дня, введите правильную дату");
                } else {
                    if (day == 31 && (months == 1 || months == 3 || months == 5
                            || months == 7 || months == 8 || months == 10)) {
                        months++;
                        day = 1;
                    } else {
                        if (day == 31 && months == 12) {
                            months = 1;
                            day = 1;
                            year++;
                        } else {
                            day++;
                        }
                    }
                }
            }
        }
        System.out.println(day + "." + months + "." + year);
    }

    /**
     * 2. Написать программу, вычисляющую корни квадратного уравнения
     * вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
     * данные.
     *     Учитывать только реальные корни (в случае отрицательного
     * дискриминанта выводить сообщение пользователю).
     *     При решении создать и использовать следующие вынесенные
     * функции:
     *     - функция isPositive, определяющая, является ли число
     * положительным
     *     - функция isZero, определяющая, является ли число нулём
     *     - функция discriminant, вычисляющая дискриминант
     * <p>
     * D = b2 − 4ac
     */
    public static float discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static boolean isZero(int a, int b, int c) {
        if (discriminant(a, b, c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositive(int a, int b, int c) {
        if (discriminant(a, b, c) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void function(int a, int b, int c) {
        if (isPositive(a, b, c) == true) {
            float x1 = (float) ((-b + sqrt(discriminant(a, b, c))) / 2 * a);
            float x2 = (float) ((-b - sqrt(discriminant(a, b, c))) / 2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            if (isZero(a, b, c) == true) {
                float x1 = (float) (-b / 2 * a);
                System.out.println("x1 = " + x1);

            } else {
                System.out.println("нет корней");
            }
        }
    }
}




