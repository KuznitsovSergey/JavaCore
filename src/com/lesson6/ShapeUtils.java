package com.lesson6;

public class ShapeUtils {
    private int diagonal1;
    private int diagonal2;
    private int height1;
    private int height2;
    private int height3;

    public ShapeUtils(int diagonal1, int diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public ShapeUtils(int height1, int height2, int height3) {
        this.height1 = height1;
        this.height2 = height2;
        this.height3 = height3;
    }

    public String rectangle() {
        return ((getDiagonal1() - getDiagonal2()) == 0) ? "прямоугольник" : "не прямоугольник";
    }

    public String triangle() {
        return ((getHeight1() + getHeight2() > getHeight3()) &&
                (getHeight2() + getHeight3() > getHeight1()) &&
                (getHeight3() + getHeight1() > getHeight2())) ? "Треугольник существует."
                : "Треугольник не существует.";
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public int getHeight1() {
        return height1;
    }

    public int getHeight2() {
        return height2;
    }

    public int getHeight3() {
        return height3;
    }

}
