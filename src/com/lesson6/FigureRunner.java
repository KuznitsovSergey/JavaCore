package com.lesson6;


public class FigureRunner {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(10, 12);
        System.out.println("Площадь треугольника = " + triangle.Area());

        Triangle triangle1 = new Triangle(60,12);
        System.out.println("Height triangle = " + triangle1.heightTriangle());

        Figure parallelogram = new Parallelogram(10, 12);
        System.out.println("Area parallelogram = " + parallelogram.Area());

        Rhombus rhombus = new Rhombus(10, 12);
        System.out.println("Area rhombus = " + rhombus.Area());

        ShapeUtils diagonal = new ShapeUtils(10,10);
        System.out.println("фигура = " + diagonal.rectangle());

        ShapeUtils triangle3 = new ShapeUtils(20,20,20);
        System.out.println("фигура = " + triangle3.triangle());

        area(triangle, parallelogram, rhombus);

    }
    protected static void area(СalculationAreas... objects) {
        for (СalculationAreas object : objects) {
            System.out.println(object.Area());
        }
    }


}
