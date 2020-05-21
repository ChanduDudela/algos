package com.basic.problems;

import com.basic.datastructures.Node;

/**
 * Checks if a LinkedList is circular
 */
public class CircularLinkedList {

  public boolean hasCycle(Node node) {
    if (node == null) {
      return false;
    }

    Node slow = node;
    Node fast = node.next;

    while (fast != null && fast.next != null) {
      if (slow.equals(fast)) {
        return true;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return false;
  }
}
