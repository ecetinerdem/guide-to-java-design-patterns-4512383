package com.example;

public class MountainUserFactory implements UiFactory {
  @Override
  public Button createButton() {
    return new BlueButton();
  }

  @Override
  public ScrollBar createScrollBar() {
    return new BlueScrollBar();
  }
}
