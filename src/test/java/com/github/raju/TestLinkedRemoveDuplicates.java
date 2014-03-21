package com.github.raju;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLinkedRemoveDuplicates {

  @BeforeTest
  public void setUp() {
     
  }

  @AfterTest
  public void cleanUp() {

  }
  @Test
  public void testRemoveDuplicates() {
     LinkedRemoveDuplicates test = new LinkedRemoveDuplicates();
     test.run("1,2,1,3,1,1,2,3,4,5,6,5");
     test.display();
     
     test = new LinkedRemoveDuplicates();
     test.run("-1,-2,-3,1,4,-5,5,1,4");
     test.display();
     
     test = new LinkedRemoveDuplicates();
     test.run(" ");
     test.display();
     
     test = new LinkedRemoveDuplicates();
     test.run("1,2,4,3,6,5");
     test.display();
  }

}
