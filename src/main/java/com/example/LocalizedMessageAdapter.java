package com.example;

public class LocalizedMessageAdapter implements LocalizedMessage {

  private static FrenchLocalizedMessage frenchLocalizedMessage;

  LocalizedMessageAdapter() {
    frenchLocalizedMessage = new FrenchLocalizedMessage();
  }

  @Override
  public void sayHello() {
    frenchLocalizedMessage.sayBonjour();
  }

}
