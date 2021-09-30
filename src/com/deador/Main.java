package com.deador;

import com.deador.applications.Messenger;
import com.deador.applications.Telegram;
import com.deador.applications.Viber;
import com.deador.applications.WhatsApp;
import com.deador.car.Audi;
import com.deador.car.Audi_2;
import com.deador.car.Car;
import com.deador.duck.Duck;
import com.deador.duck.Duck_2;
import com.deador.vector.Vector;

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
//        ------------------------------------------------------------------------------------------------------------------------------------------
        /**
         * Пример интерфейсов
         */
//        Telegram telegram = new Telegram();
//        WhatsApp whatsApp = new WhatsApp();
//        Viber viber = new Viber();
//        telegram.sendMessage();
//        whatsApp.getMessage();
//        viber.sendMessage();
//        Messenger[] messengers = {};


        Vector vector_1 = new Vector(5.0, 2.0, 3.0);
        System.out.println("Vector 1 length: " + vector_1.length());
        Vector vector_2 = new Vector(6.0, 3.0, 6.0);
        System.out.println("Vector 2 length: " + vector_2.length());
        System.out.println("Scalar product: " + vector_1.scalarProduct(vector_2) + "\n");
        System.out.println("1: " + vector_1.toString());
        System.out.println("2: " + vector_2.toString());
        Vector vector_3 = vector_1.multiplicationVector(vector_2);
        System.out.println("3: " + vector_3.toString());

        System.out.println("Injection of vectors: " + vector_1.cosOfVector(vector_2) + " \n");
        Vector vector_4 = vector_1.add(vector_3);
        System.out.println("Additional of vector_1 and vector_3: \n" + vector_4.toString() + "\n");


        System.out.println("List of random vectors: ");
        Vector[] vectors = Vector.randomVector(10);
        for(Vector vector: vectors){
            System.out.println(vector.toString() + " \n");
        }
    }


    /**
     * Метод удаления элемента с массива
     */
//    public static int[] removeElement(int[] array, int element) {
//        int offSet = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == element) {
//                offSet++;
//            } else {
//                array[i - offSet] = array[i];
//            }
//        }
//        return Arrays.copyOf(array, array.length - offSet);
//
//
//    }


}
