package com.github.raju;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNthLastNode {
  @BeforeTest
  public void setUp() {

  }

  @AfterTest
  public void cleanUp() {

  }
  @Test
  public void testNthLastElement() {
    FindNthLastElement test = new FindNthLastElement();
    test.constructLinkedList("1,2,1,3,1,1,2,3,4,5,6,5");
    System.out.println(" AAAAAAAA " + test.findNthLastElement(5));
    
    test = new FindNthLastElement();
    test.constructLinkedList("1,2");
    System.out.println(" AAAAAAAA " + test.findNthLastElement(5));
    
    test = new FindNthLastElement();
    test.constructLinkedList("");
    System.out.println(" AAAAAAAA " + test.findNthLastElement(5));
    
    test = new FindNthLastElement();
    test.constructLinkedList("2,3,4,5,6,7,8,9");
    System.out.println("AAAAAAAAAAAAA " + test.findNthLastElement(-2));
    
  }
}
