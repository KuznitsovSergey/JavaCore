package com.lessonCollection.Task2;

/**
 * Создать абстрактный класс Car, представляющий собой
 * автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько
 * своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и
 * toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением -
 * количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также
 * для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */
public class CarRun {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Bus wv = new Bus("WV", "AS", 2009, 10000, "Diesel");
        Truck zil = new Truck("Zil", "123", 1999, 15000, "Petrol");
        Minevan volvo = new Minevan("Volvo", "s80", 2019, 8000, "Diesel");
        Minevan citroen = new Minevan("Citroen", "Picasso", 2015, 9000, "Petrol");
        garage.parkingCar(wv);
        garage.parkingCar(zil);
        garage.parkingCar(volvo);
        garage.parkingCar(citroen);

        System.out.println("В гараже:");
        garage.garageDescription();

        System.out.println("Количество автомобилей Citroen в гараже: " + garage.numberOfCars(citroen) + "\n");

        System.out.println("Автомобиль Zil выехал из гаража.");
        garage.getCar(zil);
        System.out.println();

        System.out.println("Автомобили в гараже:");
        garage.garageDescription();

    }
}
