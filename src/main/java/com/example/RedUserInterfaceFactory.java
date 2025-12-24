package com.example;

public class RedUserInterfaceFactory implements UiFactory {
  @Override
  public Button createButton() {
    return new RedButton();
  }

  @Override
  public ScrollBar createScrollBar() {
    return new RedScrollBar();
  }
}
