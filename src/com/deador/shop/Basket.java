package com.deador.shop;

import java.util.Arrays;

public class Basket {
    public Basket[] arrayOfBasket;

    public Basket() {

    }

    public Basket(Basket[] arrayOfBasket) {
        this.arrayOfBasket = arrayOfBasket;
    }

    public Basket[] getArrayOfBasket() {
        return arrayOfBasket;
    }

    public void setArrayOfBasket(Basket[] arrayOfBasket) {
        this.arrayOfBasket = arrayOfBasket;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "arrayOfBasket=" + Arrays.toString(arrayOfBasket) +
                '}';
    }
}
