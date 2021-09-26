package com.deador.car;

public class Audi extends Car {
    private double cost;

    public Audi(){

    }
    public Audi(String model, int maxSpeed, double cost){
        super(model, maxSpeed);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
