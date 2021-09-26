package com.deador;

import com.deador.duck.Duck;
import com.deador.duck.Duck_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         *Пример работы с коллекциями (Инвертированый вивод коллекции, удаление эелементов)
         */
//        System.out.println("Enter int number for ArrayList: ");
//        ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
//        for (int i = 0; i < 4; i++) {
//            while (!scanner.hasNextInt()) {
//                scanner.next();
//                System.out.println("Error. Enter int number.");
//            }
//            secondArrayList.add(scanner.nextInt());
//        }
//        for (int i = 0; i < secondArrayList.size(); i++) {
//            System.out.print(secondArrayList.get(secondArrayList.size() - i - 1) + " ");
//        }
//        System.out.println();
//        System.out.println("Removing the last 2 numbers of ArrayList.");
//        secondArrayList.remove(secondArrayList.size() - 1);
//        secondArrayList.remove(secondArrayList.size() - 1);
//        System.out.println("New ArrayList: ");
//        for (Integer integer : secondArrayList) {
//            System.out.print(integer + " ");
//        }
//        System.out.println("Hello world");
//        ------------------------------------------------------------------------------------------------------------------------------------------

        /**
         * Пример работы конструкторов
         */
//        Car bugatti = new Car("Bugatti", 300);
//        System.out.println("John bought " + bugatti.getModel() + ". Max speed is: " + bugatti.getMaxSpeed());
//
//        Audi audi = new Audi("Audi RS7", 280, 1_000_000);
//        System.out.println("Alex bought " + audi.getModel() + ". Max speed is: " + audi.getMaxSpeed());
//
//        Audi_2 audi_2 = new Audi_2("Audi 2", 200, 500_000);
//        System.out.println("James bought " + audi_2.getModel() + ". Max speed is: " + audi_2.getMaxSpeed());
//
//        System.out.println("Count of sold cars are: " + Car.countOfCars);


        Duck duck = new Duck_2();
        duck.swim();

    }
}
