package com.deador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int[] firstArray = new int[4];
        System.out.println("Enter int number for array: ");
        for (int i = 0; i < firstArray.length; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Error. Enter int number.");
            }
            firstArray[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[firstArray.length - i - 1] + " ");
        }
        System.out.println();
        */
        System.out.println("Enter int number for ArrayList: ");
        ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Error. Enter int number.");
            }
            secondArrayList.add(scanner.nextInt());
        }
        for (int i = 0; i < secondArrayList.size(); i++) {
            System.out.print(secondArrayList.get(secondArrayList.size() - i - 1) + " ");
        }
        System.out.println();
        System.out.println("Removing the last 2 numbers of ArrayList.");
        secondArrayList.remove(secondArrayList.size() - 1);
        secondArrayList.remove(secondArrayList.size() - 1);
        System.out.println("New ArrayList: ");
        for (Integer integer : secondArrayList) {
            System.out.print(integer + " ");
        }
        System.out.println("Hello world");
        System.out.println();

    }
}
