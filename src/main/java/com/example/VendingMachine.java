package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

    static {
        snackMap.put("Drink", Drink::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
        snackMap.put("Chips", Chips::new);

    }

    Snack getSnack(String snackType) {
        if (snackMap.get(snackType) != null) {
            return snackMap.get(snackType).get();
        }
        throw new IllegalArgumentException("Unknown snack type");
    }

}
