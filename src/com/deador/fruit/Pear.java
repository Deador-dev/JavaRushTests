package com.deador.fruit;

public class Pear extends Fruit {
    private double cost = 0.3;

    public Pear() {

    }

    public Pear(double cost) {
        this.cost = cost;
    }

    @Override
    public double getPrice(double weight) {
        double price = weight * this.cost;
        return price;
    }

    @Override
    public void printManufacturerInfo() {
        super.printManufacturerInfo();
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "cost=" + cost +
                '}';
    }
}
