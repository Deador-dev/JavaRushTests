package com.deador.fruit;

public class Apple extends Fruit {
    private double cost = 0.25;

    public Apple() {

    }

    public Apple(double cost) {
        this.cost = cost;
    }

    @Override
    public void printManufacturerInfo() {
        super.printManufacturerInfo();
    }

    @Override
    public double getPrice(double weight) {
        double price = weight * this.cost;
        return price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "cost=" + cost +
                '}';
    }
}
