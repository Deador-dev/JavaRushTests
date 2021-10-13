package com.deador.shop;

public class Goods {
    private String nameOfGoods;
    private double cost;
    private double rating;
    public static int countOfPhones = 0;

    public Goods() {

    }

    public Goods(String name, double cost, double rating) {
        this.nameOfGoods = name;
        this.cost = cost;
        this.rating = rating;
        countOfPhones += 1;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "nameOfGoods='" + nameOfGoods + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                '}';
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNameOfGoods() {
        return nameOfGoods;
    }

    public void setNameOfGoods(String nameOfGoods) {
        this.nameOfGoods = nameOfGoods;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
