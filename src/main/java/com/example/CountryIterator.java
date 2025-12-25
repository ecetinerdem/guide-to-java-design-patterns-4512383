package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

  private CountryList countryList;
  private int index;

  public CountryIterator(CountryList countryList) {
    this.countryList = countryList;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    var countries = countryList.getCountries();
    return index < countries.length;
  }

  @Override
  public Country next() {
    var countries = countryList.getCountries();
    if (hasNext()) {
      var country = countries[index++];
      return country;
    } else {
      return null;
    }
  }

}
