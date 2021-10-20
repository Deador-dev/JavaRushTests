package com.deador.inter;

public class Animal implements Info {
    private int id;

    public Animal() {

    }

    public Animal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void makeNoise() {
        System.out.println("Noise.");
    }

    @Override
    public void showInfo() {
        System.out.println("Animal id: " + this.id);
    }
}
