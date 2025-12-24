package com.example;

public class App {

    public static void main(String[] args) {

        var appfacade = new AppFacade();
        appfacade.sendMessage();

        var sendMessageFacade = new SendMessageFacade();
        sendMessageFacade.sendMessage();

    }

}
