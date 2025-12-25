package com.example;

public class EndsWithDot implements Expression {

  @Override
  public String interpret(String context) {
    context = context + ".";
    return context;
  }
}
