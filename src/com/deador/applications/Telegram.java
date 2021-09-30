package com.deador.applications;

public class Telegram implements Messenger{

    @Override
    public void sendMessage() {
        System.out.println("Отправили сообщение в Telegram.");
    }

    @Override
    public void getMessage() {
        System.out.println("Получили сообщение в Telegram.");
    }
}
