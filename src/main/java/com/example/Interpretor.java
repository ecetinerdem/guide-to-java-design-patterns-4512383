package com.example;

public class Interpretor implements Expression {

  private StartsWithCapital startsWithCapital = new StartsWithCapital();

  @Override
  public String interpret(String context) {
    return startsWithCapital.interpret(context);
  }

}
