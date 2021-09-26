package com.deador;

public class Audi extends Car{
    private double cost;

    public Audi(){

    }
    public Audi(String model, int maxSpeed, double cost){
        this.setModel(model);
        this.setMaxSpeed(maxSpeed);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
