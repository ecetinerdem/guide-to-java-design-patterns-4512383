package com.example;

import java.util.Iterator;

public class CountryList implements Iterable<Country> {

  private final Country[] countries;

  CountryList(Country... countries) {
    this.countries = countries;
  }

  @Override
  public Iterator<Country> iterator() {
    return new CountryIterator(this);
  }

  public Country[] getCountries() {
    return countries;
  }

}
