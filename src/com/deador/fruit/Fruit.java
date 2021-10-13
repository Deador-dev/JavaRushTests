package com.deador.fruit;

public abstract class Fruit {
    private double weight;

    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract double getPrice(double weight);

}
