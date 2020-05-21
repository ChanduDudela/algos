package com.basic.datastructures;

import java.util.Stack;

/**
 * Queue Implementation With 2 Stacks
 *
 * @param <T> any generic type
 */
class QueueWithStacks<T> {
  final Stack<T> newestOnTop = new Stack<>();
  final Stack<T> oldestOnTop = new Stack<>();

  public void enqueue(T data) {
    newestOnTop.push(data);
  }

  public void shiftStacks() {
    if (oldestOnTop.isEmpty()) {
      while(!newestOnTop.isEmpty()){
        oldestOnTop.push(newestOnTop.pop());
      }
    }
  }

  public T peek() {
    shiftStacks();
    return oldestOnTop.peek();
  }

  public T dequeue() {
    shiftStacks();
    return oldestOnTop.pop();
  }
}
