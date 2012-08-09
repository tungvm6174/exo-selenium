package org.exoplatform.selenium;

public abstract class TestSuite {
  protected void log(String msg) {
    System.out.println(String.format("%-80s%s", "@Test-" + this.getClass().getName(), msg).replace(' ', '.'));
  }
  
  public abstract void defaultTestCase();
}
