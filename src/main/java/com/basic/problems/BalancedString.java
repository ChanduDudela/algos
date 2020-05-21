package com.basic.problems;

import java.util.Stack;

/**
 * Checks if a String has balanced Tokens
 * Example: {[]}(){}[{()}]
 *
 */
public class BalancedString {
  char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

  public boolean isBalanced(String input) {
    Stack<Character> tempStack = new Stack<>();
    for (char inputToken : input.toCharArray()) {
      if (isOpeningChar(inputToken)) {
        tempStack.push(inputToken);
      } else {
        if (tempStack.isEmpty() || !isMatching(tempStack.pop(), inputToken)) {
          return false;
        }
      }
    }
    return tempStack.isEmpty();
  }

  private boolean isOpeningChar(char openingToken) {
    for (char[] tokenSet : TOKENS) {
      if (tokenSet[0] == openingToken) {
        return true;
      }
    }
    return false;
  }

  private boolean isMatching(char openToken, char inputClosingToken) {
    for (char[] tokenSet : TOKENS) {
      if (tokenSet[0] == openToken) {
        return tokenSet[1] == inputClosingToken;
      }
    }
    return false;
  }
}
