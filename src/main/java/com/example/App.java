package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        Interpretor interpretor = new Interpretor();
        context = interpretor.interpret(context);
        System.out.println(context);
    }

}
