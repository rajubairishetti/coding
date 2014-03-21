package com.github.raju;

public class FindNthLastElement extends LinkedListUtil {

  /*
   * Take two pointers and keep one pointer at starting and move another pointer to point to nth from starting
   * Then move the both pointers and when the second pointer reaches the end then first pointer will be nth from last.
   * Because they are separated by n nodes. returns -1 if linked list does not contain n nodes.
   */
  public int findNthLastElement(int n) {
    ListNode startNode = head;
    ListNode nthNode = startNode;

    while (n > 0 && nthNode != null) {
      nthNode = nthNode.next;
      n = n-1;
    }

    if (n == 0 && nthNode == null) {
      return startNode.data;
    } else if (n != 0) {
      System.out.println("BNNNNNNNNNNNN " + n);
      return -1;
    } else {
      while (nthNode.next != null) {
        startNode = startNode.next;
        nthNode = nthNode.next;
      }
    }

    return startNode.data;
  }
}
