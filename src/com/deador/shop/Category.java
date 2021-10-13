package com.deador.shop;

import java.util.Arrays;

public class Category {
    private String nameOfCategory;
    private Goods[] arrayOfGoods;

    public Category() {

    }

    public Category(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }

    public Category(String nameOfCategory, Goods[] arrayOfGoods) {
        this(nameOfCategory);
        this.arrayOfGoods = arrayOfGoods;

    }

    public Goods[] getArrayOfGoods() {
        return arrayOfGoods;
    }

    public void setArrayOfGoods(Goods[] arrayOfGoods) {
        this.arrayOfGoods = arrayOfGoods;
    }

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nameOfCategory='" + nameOfCategory + '\'' +
                ", arrayOfGoods=" + Arrays.toString(arrayOfGoods) +
                '}';
    }
}
