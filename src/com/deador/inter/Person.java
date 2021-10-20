package com.deador.inter;

public class Person implements Info {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println("Person is sleeping.");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name: " + this.name);
    }
}