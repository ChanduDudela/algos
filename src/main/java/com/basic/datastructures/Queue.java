package com.basic.datastructures;

/**
 * Queue implementation
 */
public class Queue {

  Node head;
  Node tail;

  public Queue(Node head) {
    this.head = head;
    this.tail = head;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int peek() {
    if (head == null) {
      return -1; //throw some exception
    }
    return head.data;
  }

  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public int remove() {
    if (head == null) {
      return -1; //throw some exception
    }
    int data = head.data;
    if (head.next != null) {
      head = head.next;
    }
    return data;
  }
}
