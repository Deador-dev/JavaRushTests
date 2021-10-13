package com.deador.flower;

public class Flower {
    private String manufacturerCountry = "none";
    private int shelfLifeInDays;
    private double price;

    public Flower() {

    }

    public Flower(String manufacturerCountry, int shelfLifeInDays, double price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.price = price;
    }


    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(int shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }
}
