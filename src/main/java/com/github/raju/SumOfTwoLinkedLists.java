package com.github.raju;

public class SumOfTwoLinkedLists extends LinkedListUtil {
  LinkedListUtil list1 = new LinkedListUtil();
  LinkedListUtil list2 = new LinkedListUtil();

  public SumOfTwoLinkedLists() {

  }

  private LinkedListUtil addLists(LinkedListUtil list1, LinkedListUtil list2) {
    if (list1.head == null && list2.head == null) {
      return null;
    }
    if (list1.head == null) {
      return list2;
    }
    if (list2.head == null) {
      return list1;
    }
    ListNode firstTmpNode = list1.head;
    ListNode secondTmpNode = list2.head;
    LinkedListUtil list3 = new LinkedListUtil();

    int carry = 0;
    int sum = 0;
    while (firstTmpNode != null && secondTmpNode != null) {
      sum = firstTmpNode.data + secondTmpNode.data + carry;
      if (sum > 9) {
        carry = 1;
      } else {
        carry = 0;
      }
      list3.addNodeAtTail(sum%10);
      firstTmpNode = firstTmpNode.next;
      secondTmpNode = secondTmpNode.next;
    }
    while (firstTmpNode != null) {
      sum = firstTmpNode.data + carry;
      list3.addNodeAtTail(sum % 10);
      carry = sum >= 10 ? 1 : 0;
      firstTmpNode = firstTmpNode.next;
    }
    while (secondTmpNode != null) {
      sum = secondTmpNode.data + carry;
      list3.addNodeAtTail(sum % 10);
      carry = sum >= 10 ? 1 : 0;
      secondTmpNode = secondTmpNode.next;
    }
    if (carry == 1) {
      list3.addNodeAtTail(carry);
    }
    return list3;
  }

  protected void run(String firstListStr, String secondListStr) {
    list1.constructLinkedList(firstListStr);
    list2.constructLinkedList(secondListStr);
    LinkedListUtil list3 = addLists(list1, list2);
    list3.display();
  }

  public static void main(String[] args) {
    SumOfTwoLinkedLists sum = new SumOfTwoLinkedLists();
    if (args.length != 2) {
      sum.run(args[0], args[1]);    
    } else {
      System.out.println("Usage: SumOfTwoLinkedLists <firstLinkedLKist> <secondLinkedList>");
    }
  }

}
