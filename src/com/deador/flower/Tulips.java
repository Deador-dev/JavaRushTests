package com.deador.flower;

public class Tulips extends Flower {
    public Tulips() {

    }
    public Tulips(String manufacturerCountry, int shelfLifeInDays, double price){
        super(manufacturerCountry, shelfLifeInDays, price);
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "manufacturerCountry='" + getManufacturerCountry() + '\'' +
                ", shelfLifeInDays=" + getShelfLifeInDays() +
                ", price=" + getPrice() +
                '}';
    }

}
