package com.deador.applications;

public class WhatsApp implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Отправили сообщение в WhatsApp.");
    }

    @Override
    public void getMessage() {
        System.out.println("Получили сообщение в WhatsApp.");
    }
}
