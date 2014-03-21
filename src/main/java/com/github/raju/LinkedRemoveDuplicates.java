package com.github.raju;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedRemoveDuplicates extends LinkedListUtil{

  LinkedList<ListNode> lst = new LinkedList<LinkedListUtil.ListNode>();

  private ListNode getHead() {
    return head;
  }

  private void setHead(ListNode firstNode) {
    head = firstNode;
  }

  private void removeDuplicates() {
    /* if (lst.size() <= 1) {
      System.out.println("No duplicates ");
    }*/
    ListNode prevNode = head; // lst.getFirst();
    if (head == null) {
      return;
    }
    // setHead(prevNode);
    ListNode currentNode = prevNode.next;
    while (currentNode != null) {
      ListNode runner = head;
      while (runner != currentNode) {
        if (runner.data == currentNode.data) {
          System.out.println("removeing duplicate " + currentNode.data);
          ListNode temp = currentNode.next;
          prevNode.next = temp;
          currentNode = temp;
          break;
        }
        runner = runner.next;
      }
      if (runner == currentNode) {
        prevNode = currentNode;
        currentNode = currentNode.next;
      }
    }
  }

  public void run(String args) { 
    this.constructLinkedList(args);
    display();
    // remove duplicates from the linked list
    removeDuplicates();
  }

  public static void main(String[] args) {
    LinkedRemoveDuplicates obj = new LinkedRemoveDuplicates();
    if (args.length == 1) {
      obj.run(args[0]);
    } else {
      System.out.println("Uasge: LinkedRemoveDuplicates <sizeOfLinkedList> <ElementString>");
    }
  }
}
