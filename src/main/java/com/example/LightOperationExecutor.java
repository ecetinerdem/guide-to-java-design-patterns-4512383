package com.example;

import java.util.ArrayList;
import java.util.List;

public class LightOperationExecutor {
  private final List<Operation> operations = new ArrayList<>();

  public void addOperationList(Operation operation) {
    operations.add(operation);
  }

  public void executeOperations() {
    operations.forEach(operation -> operation.execute());
    operations.clear();
  
  }
}
