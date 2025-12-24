package com.example;

public class LocalizedMessageAdapter implements LocalizedMessage {

  private final FrenchLocalizedMessage frenchLocalizedMessage;

  LocalizedMessageAdapter() {
    frenchLocalizedMessage = new FrenchLocalizedMessage();
  }

  @Override
  public void sayHello() {
    frenchLocalizedMessage.sayBonjour();
  }

}
