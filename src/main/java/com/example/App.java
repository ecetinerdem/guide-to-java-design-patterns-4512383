package com.example;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var countryList = new CountryList(nigeria, canada, argentina);
        var countryIterator = countryList.iterator();

        while (countryIterator.hasNext()) {
            System.out.println(countryIterator.next().getName());
        }

    }

}
