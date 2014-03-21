package com.github.raju;

import org.testng.annotations.Test;

public class TestSumOfLinkedLists {

  @Test
  public void testSumOfLists() {
    SumOfTwoLinkedLists sum = new SumOfTwoLinkedLists();
    sum.run("3,1,5", "5,9,2");

    sum = new SumOfTwoLinkedLists();
    sum.run("1", "2,3,4,5");

    sum = new SumOfTwoLinkedLists();
    sum.run("8", "9,9,4,5");

    sum = new SumOfTwoLinkedLists();
    sum.run("8", "");

    sum = new SumOfTwoLinkedLists();
    sum.run("8", "9");
  }
}
