package com.deador;

import com.deador.inter.Info;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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

        /**
         * Пример методов для векторов
         */
        /*
        Vector vector_1 = new Vector(5.0, 2.0, 3.0);
        System.out.println("Vector 1 length: " + vector_1.length());
        Vector vector_2 = new Vector(6.0, 3.0, 6.0);
        System.out.println("Vector 2 length: " + vector_2.length());
        System.out.println("Scalar product: " + vector_1.scalarProduct(vector_2) + "\n");
        System.out.println("1: " + vector_1);
        System.out.println("2: " + vector_2);
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
         */
        /**
         * Задача с весом и размером массива
         */
        /*
        int[] arrayOfValues = {1, 2, 3};
        int[] arrayOfWeights = {1, 3, 10};

        RandomFromArray randomFromArray = new RandomFromArray(arrayOfValues, arrayOfWeights);
        System.out.println("Random number is: " + randomFromArray.getRandom());
        */

        /**
         * Двоичный поиск большого массива
         */
        /*
        int[] arrayBinary = new int[100000000];
        BinarySearch binarySearch = new BinarySearch();
        for (int i = 0; i < arrayBinary.length; i++) {
            arrayBinary[i] = (int) (Math.random() * 100000000);
        }
        System.out.println("Before sort.");
        for(int element: arrayBinary){
            System.out.print(element + " ");
        }
        System.out.println();
        int[] arrayNew = binarySearch.bubbleSorter(arrayBinary);
        System.out.println("After bubble sorter.");
        for(int i: arrayNew){
            System.out.print(i + " ");
        }
        System.out.println();
        int indexOfElementToSearch = binarySearch.binarySearch(arrayBinary, 5);
        System.out.println("Index of element: " + indexOfElementToSearch);

         */

        /**
         * Задача с магазином
         */
        /*
        Goods phone_1 = new Goods("Xiaomi", 4.000, 8.5);
        Goods phone_2 = new Goods("LG", 3.000, 5.5);

        Goods[] phones = {phone_1, phone_2};
        Category category = new Category("Phones", phones);
        for(Goods good: phones){
            System.out.println(good.toString());
        }
        System.out.println("Кол-во телефонов " + Goods.countOfPhones + ".");
         */

        /**
         * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
         * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
         * Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов разного типа.
         * Также подсчитать количество проданных цветов (используем статическую переменную).
         */
        /*
        //Created flowers
        Flower roses_1 = new Roses("UA", 5, 1.5);
        Flower tulip_1 = new Tulips("USA", 10, 0.8);

        //Created bouquet
        Flower[] bouquet_1 = new Flower[10];

        System.out.println("Какой цветок вы хотите добавить в букет ?\nСписок доступных цветов: Rose, Tulip.\nЕсли Вы закончили собирать букет, напишите 'End'");
        int countOfBouquet = 0;
        System.out.println("Сколько букетов вы хотите ?");
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Pls enter integer number.");
            scanner.next();
        }
        countOfBouquet = scanner.nextInt();
        //Information about count of flowers and total price
        String temp = "none";
        int index = 0;
        int countOfFlowers = 0;
        double price = 0;
        int i = 1;

        //----------------------------------------------------------------------
        while (i <= countOfBouquet) {
            System.out.println("Букет " + i + ".");
            label:
            while (true) {
                if (countOfFlowers >= 10) {
                    System.out.println("Максисальное кол-во цветов в букете: 10.");
                    break;
                }
                temp = scanner.nextLine();
                switch (temp) {
                    case "Rose":
                        System.out.println("Вы добавили розу в букет.");
                        bouquet_1[index] = roses_1;
                        index++;
                        countOfFlowers++;
                        price += roses_1.getPrice();
                        break;
                    case "Tulip":
                        System.out.println("Вы добавили тульпан в букет.");
                        bouquet_1[index] = tulip_1;
                        index++;
                        countOfFlowers++;
                        price += tulip_1.getPrice();
                        break;
                    case "End":
                        break label;
                    default:
                        System.out.println("Error. Pls enter flower name or 'End'");
                        break;
                }
            }
            //----------------------------------------------------------------------

            for (Flower flower : bouquet_1) {
                if (flower != null) {
                    System.out.println(flower.toString());
                }
            }

            System.out.println("Цена букета: " + price + "$");
            System.out.println("Продано " + index + " цветов.");
            i++;
            Arrays.fill(bouquet_1, null);
            price = 0;
            index = 0;
        }
        */
        /**
         * Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его. Класс Фрукт содержит:
         * а) переменную вес,
         * б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
         * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
         * Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов. А также общую стоимость отдельно проданных яблок, груш и абрикос.
         */
        /*
        Apple apple = new Apple();
        Pear pear = new Pear();
        Fruit[] fruits = {apple, pear};

        double price = 0;
        for (Fruit fruit : fruits) {
            price += fruit.getPrice(2.0);
        }
        System.out.println("Price for 2.3 kg apple and 2.3 kg pear = " + price + "$");
        */


        /**
         * Input Stream | Output Stream
         */
        /*
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteArrayInputStream1.read()) != -1) {
            System.out.print(b + " ");
        }
        System.out.println();
        String str = "Hello world";
        byte[] array2 = str.getBytes();
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(array2, 0, 5);
        while ((b = byteArrayInputStream2.read()) != -1) {
            System.out.print((char) b);
        }


        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("k://TEXT.txt"));
            System.out.println("Размер файла: " + bufferedInputStream.available() + " байт(а)");
            byte[] buffer = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(buffer, 0, buffer.length);

            for (int i : buffer) {
                System.out.print((char) i);
            }

            FileOutputStream fileOutputStream = new FileOutputStream("k:\\New.txt");
            fileOutputStream.write(buffer);

            bufferedInputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        */


        /**
         * Пример работы с ИНТЕРФЕЙСОМ
         */
        /*
        Animal animal = new Animal(7);
        Person person = new Person("James");
        Info info = new Animal(1);
        animal.showInfo();
        animal.makeNoise();

        person.showInfo();
        person.sleep();

        info.showInfo();
        System.out.println();
        outputShowInfo(animal);
        outputShowInfo(person);
        outputShowInfo(info);
        */

        /*
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("k://"));
            System.out.printf("Размер файла %d байт.\n", bufferedInputStream.available());
            byte[] array = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(array, 0, array.length);
            for (int i : array) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         */


/**
 * Запись объектов в файл
 */     /*
        Person person_1 = new Person("James", 1);
        Person person_2 = new Person("Bob", 2);
        try {
            FileOutputStream fos = new FileOutputStream("binaryObjects.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person_1);
            oos.writeObject(person_2);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/**
 *  Чтение объектов с файла
 */     /*
        try {
            FileInputStream fileInputStream = new FileInputStream("binaryObjects.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person_3 = (Person) objectInputStream.readObject();
            Person person_4 = (Person) objectInputStream.readObject();
            System.out.println(person_3);
            System.out.println(person_4);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        */
/**
 *  Запись и чтений массива объектов
 */
//        Person[] people = {new Person("James", 1), new Person("Bob", 2), new Person("Tom", 3)};
//        // Writing
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("binaryObjects.bin"))) {
//            // First way
//            objectOutputStream.writeInt(people.length);
//            for (Person person : people) {
//                objectOutputStream.writeObject(person);
//            }
//            // Second way
////            objectOutputStream.writeObject(people);
//
//            objectOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Reading
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("binaryObjects.bin"))) {
//            // First way
//            int index = objectInputStream.readInt();
//            Person[] peopleFromFile = new Person[index];
//            for (int i = 0; i < peopleFromFile.length; i++) {
//                peopleFromFile[i] = (Person) objectInputStream.readObject();
//            }
//            for (Person person : peopleFromFile) {
//                System.out.println(person);
//            }
//            //Second way
////            Person[] peopleFromFile = (Person[]) objectInputStream.readObject();
////            System.out.println(Arrays.toString(peopleFromFile));
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

/**
 *  Enum пример
 */
//        Animals animal = Animals.FROG;
//        System.out.println(animal.toString());
        ThreadScanner threadScanner = new ThreadScanner();
        Thread thread_1 = new Thread(threadScanner);
        thread_1.start();
        scanner.nextLine();
        threadScanner.shutDown();


    }


    /**
     * Метод удаления элемента с массива
     */
    public static int[] removeElementFromArray(int[] array, int elementToRemove) {
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }

    public static int[] bubbleSorter(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    public static void outputShowInfo(Info info) {
        info.showInfo();
    }

    static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}

//class Runner implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("First thread " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

class ThreadScanner implements Runnable {
    Scanner scanner = new Scanner(System.in);
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread scanner.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        this.running = false;
    }
}
