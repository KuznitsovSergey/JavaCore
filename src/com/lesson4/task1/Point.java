package com.lesson4.task1;

import static java.lang.StrictMath.*;

/**
 * Занятие 11.1. Введение в ООП. Домашнее задание
 * <p>
 * + Создать класс Point, описывающий точку в двумерных
 * координатах. 
 * <p>
 * + Полями этого класса должны быть координаты x и y.
 * <p>
 * + Класс должен иметь один конструктор, принимающий координаты
 * x и y.
 * <p>
 * + Добавьте функционал для получения скрытой информации
 * (координаты точки), а получить её можно только с помощью
 * методов доступа (get/set).
 * <p>
 * + Создать метод distance, принимающий объект Point и
 * определяющий расстояние до неё.
 * AB = √(xb - xa)2 + (yb - ya)2
 * <p>
 * + Используя класс точки, создать класс Rectangle, описывающий
 *  * прямоугольник. 
 *  * <p>
 *  * В нём хранятся два поля типа Point - координаты левого верхнего и
 *  * правого нижнего углов.
 *  * <p>
 *  * Создать следующие методы в классе Rectangle:
 *  * +- Высчитывающий площадь прямоугольника
 *  * +- Высчитывающий длину диагонали
 *  * <p>
 *  * Написать тестовый класс с методом main программу,
 *  * демонстрирующим создание объекта класса Rectangle и
 *  * применение вышеперечисленных методов.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point) {
        return sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}
