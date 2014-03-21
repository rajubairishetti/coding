package com.github.raju;

public class LinkedListUtil {

  class ListNode {
    int data;
    ListNode next;

    public ListNode() {
      // TODO Auto-generated constructor stub
    }

    public ListNode(int data) {
      this.data = data;
      next = null;
    }
  }

  ListNode head = null;

  protected void constructLinkedList(String elementStr) {
    // parse the string
    String [] elemntSplits = elementStr.split(",");
    for (String element : elemntSplits) {
      element.trim();
      if (element == null || element.equals(" ") || element.isEmpty()) {
        System.out.println("ignore this element");
        continue;
      }
      System.out.println("EEEEEEEEEEEEEEE element " + element.isEmpty());
      addNodeAtTail(Integer.parseInt(element));
     // display();
      //lst.add(new ListNode(Integer.parseInt(element)));
    }  
  }

  protected void addNodeAtTail(int data) {
    ListNode newNode = new ListNode(data);
    if (head == null) {
      head = newNode;
      return;
    }
    ListNode tempNode = head;
    while(tempNode.next != null) {
      tempNode = tempNode.next;
    }
    tempNode.next = newNode;
  }

  protected void addInSortedOrder(int data) {
    ListNode newNode = new ListNode(data);
    if (head == null) {
      head = newNode;
      return;
    }
    ListNode tempNode = head;
    while(tempNode.next != null) {
      if (tempNode.data < data && tempNode.next.data > data) {
        break;
      }
      tempNode = tempNode.next;
    }
    if (tempNode.next != null) {
      newNode = tempNode.next.next;
    }
    tempNode.next = newNode;
  }

  protected int deleteAtEnd() {
    ListNode prevNode = head;
    if (head == null) {
      System.out.println("List is empty");
      return -1;
    }
    ListNode current = prevNode.next;
    while (current != null && current.next != null) {
      prevNode = current;
      current = current.next;
    }
    prevNode.next = null;
    return current.data;
  }

  protected int deleteFirstNode() {
    if (isEmpty()) {
      System.out.println("List is empty");
      return -1;
    }
    int data = head.data;
    head = head.next;
    return data;
  }

  private boolean isEmpty() {
    return head == null;
  }

  protected void deleteNode(int data) {
    ListNode prevNode = head;
    if (isEmpty()) {
      System.out.println("List is empty");
    }
    ListNode current = prevNode.next;
    while (current != null && current.data != data) {
      prevNode = current;
      current = current.next;
    }
    if (current != null) {
      prevNode.next = prevNode.next.next;
    }
  }

  public void display() {
    ListNode current = head;
    while (current != null) {
      System.out.println(current.data + "   ");
      current = current.next;
    }
    /* Iterator<ListNode> it = lst.iterator();
    while (it.hasNext()) {
      System.out.println(" " + it.next().data);
    }*/
  }
}
