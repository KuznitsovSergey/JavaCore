package com.lesson4.task1;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(3, 1);
        Point point2 = new Point(1, 3);

        System.out.println("Растояние между точками: " + point1.distance(point2));

        Rectangle rectangle = new Rectangle(point1, point2);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());

    }
}
