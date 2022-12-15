package org.example;

import org.apache.commons.text.diff.StringsComparator;

public class B {
  public void printInfo() {
    System.out.println("I'm B");
  }

  /**
   * Random fn. using apache commons dependency for demonstration.
   */
  public void printDiff() {
    StringsComparator stringsComparator = new StringsComparator("hello", "hello123");
    System.out.println(stringsComparator.getScript().getModifications());
  }
}
