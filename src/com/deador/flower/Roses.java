package com.deador.flower;

public class Roses extends  Flower{
    public Roses(){

    }
    public Roses(String manufacturerCountry, int shelfLifeInDays, double price){
        super(manufacturerCountry, shelfLifeInDays, price);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "manufacturerCountry='" + getManufacturerCountry() + '\'' +
                ", shelfLifeInDays=" + getShelfLifeInDays() +
                ", price=" + getPrice() +
                '}';
    }
}
