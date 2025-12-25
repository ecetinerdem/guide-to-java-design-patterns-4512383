package com.example;

public interface CheckOut {
  public void checkOut();

  CheckOut payWithCard = () -> System.out.println("Payment made with card");
  CheckOut payByBankTransfer = () -> System.out.println("Payment made by bank transfer");
}
