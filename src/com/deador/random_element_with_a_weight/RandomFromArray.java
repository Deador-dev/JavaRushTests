package com.deador.random_element_with_a_weight;

public class RandomFromArray {
    private int[] values;
    private int[] weights;
    private int sum;
    private int range;

    public RandomFromArray() {
        this.values = null;
        this.weights = null;
    }

    public RandomFromArray(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        this.sum = values.length + weights.length;
    }


    public int getRandom() {
        int index = 0;
        for (int i = 0; i < weights.length; i++) {
            index += weights[i];
        }
        int[] tempArray = new int[index];
        index = 0;
        for(int i = 0; i < weights.length; i++){
            for(int j = 0; j < weights[i]; j++){
                tempArray[index++] = values[i];
            }
        }
        int random = (int) (Math.random() * (tempArray.length -1));
        System.out.println();
        return tempArray[random];
    }


    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public int[] getWeights() {
        return weights;
    }

    public void setWeights(int[] weights) {
        this.weights = weights;
    }

    public int getsum() {
        return sum;
    }

    public void setsum(int sum) {
        this.sum = sum;
    }
}
