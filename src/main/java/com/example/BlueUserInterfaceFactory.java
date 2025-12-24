package com.example;

public class BlueUserInterfaceFactory implements UiFactory {
  @Override
  public Button createButton() {
    return new BlueButton();
  }

  @Override
  public ScrollBar createScrollBar() {
    return new BlueScrollBar();
  }
}
