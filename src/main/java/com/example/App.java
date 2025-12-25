package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light(true);

        // remove adding list in operation executor to have it sequantial.
        var operationExecutor = new LightOperationExecutor();
        operationExecutor.addOperationList(new TurnLightOnOperation(light));
        light.isOn();
        operationExecutor.addOperationList(new TurnLightOffOperation(light));
        light.isOn();
        operationExecutor.addOperationList(new TurnLightOnOperation(light));
        light.isOn();
        operationExecutor.executeOperations();
        light.isOn();
    }

}
