package com.basic.datastructures;

public class BSTNode {
  BSTNode left, right;
  int data;

  public BSTNode(int data) {
    this.data = data;
  }

  public void insert(int value) {
    if (value <= data) {
      if (left == null) {
        left = new BSTNode(value);
      } else {
        left.insert(value);
      }
    } else {
      if (right == null) {
        right = new BSTNode(value);
      } else {
        right.insert(value);
      }
    }
  }

  public boolean contains(int value) {
    if (data == value) {
      return true;
    }
    if (value <= data) {
      if (left == null) {
        return false;
      } else {
        return left.contains(value);
      }
    } else {
      if (right == null) {
        return false;
      } else {
        return right.contains(value);
      }
    }
  }

  public void printInOrder() {
    if (left != null) {
      left.printInOrder();
    }
    System.out.println(data);
    if (right != null) {
      right.printInOrder();
    }
  }

  public void printPreOrder() {
    System.out.println(data);
    if (left != null) {
      left.printPreOrder();
    }
    if (right != null) {
      right.printPreOrder();
    }
  }

  public void printPostOrder() {
    if (left != null) {
      left.printPostOrder();
    }
    if (right != null) {
      right.printPostOrder();
    }
    System.out.println(data);
  }
}
