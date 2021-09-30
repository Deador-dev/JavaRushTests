package com.deador.applications;

public class Viber implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Отправили сообщение в Viber.");
    }

    @Override
    public void getMessage() {
        System.out.println("Получили сообщение в Viber.");
    }
}
