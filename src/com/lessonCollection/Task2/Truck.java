package com.lessonCollection.Task2;

public class Truck extends Car{

    protected Truck(String make, String model, Integer yearManufacture, Integer price, String engineType) {
        super(make, model, yearManufacture, price, engineType);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
