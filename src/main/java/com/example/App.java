package com.example;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.checkOut(CheckOut.payWithCard);
        checkoutPage.checkOut(CheckOut.payByBankTransfer);

    }

}
