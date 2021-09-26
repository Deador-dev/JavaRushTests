package com.deador.car;

public class Car {
    static int countOfCars;
    private String model;//модель
    private int maxSpeed;//максимальная скорость
    private int wheels;//ширина дисков
    private double engineVolume;//объем двигателя
    private String color;//цвет
    private int yearOfIssue;//год выпуска
    private String ownerFirstName;//имя владельца
    private String ownerLastName;//фамилия владельца
    private long price;//цена
    private boolean isNew;//новая или нет
    private int placesInTheSalon;//число мест в салоне
    private String salonMaterial;//материал салона
    private boolean insurance;//застрахована ли
    private String manufacturerCountry;//страна-производитель
    private int trunkVolume;//объем багажника
    private int accelerationTo100km;//разгон до 100 км/час в секундах

    public Car() {
        countOfCars += 1;
        this.model = "-1";
        this.maxSpeed = -1;
        this.wheels = -1;
        this.engineVolume = -1.0;
        this.color = "-1";
        this.yearOfIssue = -1;
        this.ownerFirstName = "-1";
        this.ownerLastName = "-1";
        this.price = -1L;
        this.isNew = false;
        this.placesInTheSalon = -1;
        this.salonMaterial = "-1";
        this.insurance = false;
        this.manufacturerCountry = "-1";
        this.trunkVolume = -1;
        this.accelerationTo100km = -1;
    }

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        countOfCars += 1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
