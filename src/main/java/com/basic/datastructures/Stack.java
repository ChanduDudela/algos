package com.basic.datastructures;

public class Stack {
  Node top;

  public Stack(Node top) {
    this.top = top;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public int peek() {
    if (top == null) {
      return -1; //throw some exception
    }
    return top.data;
  }

  public void add(int data) {
    Node newNode = new Node(data);
    if (top == null) {
      top = newNode;
    }
    newNode.next = top;
    top = newNode;
  }

  public int remove() {
    if (top == null) {
      return -1; //throw some exception
    }
    int data = top.data;
    top = top.next;
    return data;
  }
}
