package com.example;

public class EndsWithDot implements Expression {

  @Override
  public String interpret(String context) {
    if (context.endsWith(".")) {
      context = context + ".";
    }
    return context;
  }
}
