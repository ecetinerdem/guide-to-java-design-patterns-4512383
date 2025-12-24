package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

  private final static Map<String, Supplier<UiFactory>> uiFactoryMap = new HashMap<>();

  static {
    uiFactoryMap.put("RED", RoadUserFactory::new);
    uiFactoryMap.put("BLUE", MountainUserFactory::new);
  }

  public static UiFactory createFactory(String type) {
    if (uiFactoryMap.get(type) != null) {
      return uiFactoryMap.get(type).get();
    } else {
      throw new IllegalArgumentException("No such type exist");
    }
  }

}
