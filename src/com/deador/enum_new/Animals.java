package com.deador.enum_new;

public enum Animals {
    DOG("Собака"), CAT("Кот"), FROG("Лягушка");

    private String translation;

    Animals() {

    }

    Animals(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return this.translation;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
