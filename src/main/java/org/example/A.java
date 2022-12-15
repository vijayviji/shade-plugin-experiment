package org.example;

import com.google.inject.Inject;

public class A {
  private final B b;
  @Inject
  public A(B b) {
    this.b = b;
  }

  public void printDeps() {
    System.out.println("I'm A and I'm calling B");
    b.printInfo();
    b.printDiff();
  }
}
