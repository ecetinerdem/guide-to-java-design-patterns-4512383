package com.example;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

  private static final Map<String,Flower> flowerChache = new HashMap<>();

  public static Flower growFlower(String flowerName) {
    return flowerChache.computeIfAbsent(flowerName, Flower::new);
  }
  
  
}
