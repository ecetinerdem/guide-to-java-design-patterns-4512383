package com.example;

public class App {

    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }

    private static UserInterface createUserInterface(String color) {
        var uiFactory = FactoryMaker.createFactory(color);
        var button = uiFactory.createButton();
        var scrollbar = uiFactory.createScrollBar();
        return new UserInterface(button, scrollbar);
    }

}
