package com.lessonCollection.Task2;

public abstract class Car {
    private final String make;
    private final String model;
    private final Integer yearManufacture;
    private final Integer price;
    private final String engineType;

    protected Car(String make, String model, Integer yearManufacture, Integer price, String engineType) {
        this.make = make;
        this.model = model;
        this.yearManufacture = yearManufacture;
        this.price = price;
        this.engineType = engineType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearManufacture() {
        return yearManufacture;
    }

    public Integer getPrice() {
        return price;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
