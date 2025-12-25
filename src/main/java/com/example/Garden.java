package com.example;

public class Garden {

    public static void main(String[] args) {

        var sunflower1 = FlowerFactory.growFlower("Sunflower");
        var sunflower2 = FlowerFactory.growFlower("Sunflower");
        var sunflower3 = FlowerFactory.growFlower("Sunflower");
        System.out.println(sunflower1);
        System.out.println(sunflower2);
        System.out.println(sunflower3);

        var rose1 = FlowerFactory.growFlower("Rose");
        var rose2 = FlowerFactory.growFlower("Rose");
        var rose3 = FlowerFactory.growFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);

    }

}
