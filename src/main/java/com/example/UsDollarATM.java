package com.example;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nexAtm) {
        super(nexAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {

        if (request.getCurrency().equals(WithdrawalRequest.Currency.USD)) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (nextAtm != null) {
            nextAtm.dispense(request);
        }
        
    }

}
