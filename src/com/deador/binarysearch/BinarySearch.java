package com.deador.binarysearch;

public class BinarySearch {
    private int[] array;
    private int elementToSearch;

    public BinarySearch() {

    }

    public BinarySearch(int[] array, int elementToSearch) {
        this.array = array;
        this.elementToSearch = elementToSearch;
    }

    public int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex < lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;
            if (elementToSearch == array[middleIndex]) {
                return middleIndex;
            }
            if (elementToSearch > array[middleIndex]) {
                firstIndex = middleIndex + 1;
            }
            if (elementToSearch < array[middleIndex]) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public int[] bubbleSorter(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int temp;
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


}
