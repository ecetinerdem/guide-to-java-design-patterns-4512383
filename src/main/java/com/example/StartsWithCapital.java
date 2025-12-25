package com.example;

public class StartsWithCapital implements Expression {
  private EndsWithDot endsWithDot = new EndsWithDot();

  @Override
  public String interpret(String context) {
    context = context.substring(0, 1).toUpperCase() + context.substring(1);
    return endsWithDot.interpret(context);
  }

}
