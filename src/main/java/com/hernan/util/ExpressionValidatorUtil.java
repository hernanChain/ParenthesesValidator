package com.hernan.util;

import java.util.Stack;

public class ExpressionValidatorUtil {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char symbol : expression.toCharArray()) {
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastSymbolSaved = stack.pop();
                if (!doesMatch(symbol, lastSymbolSaved)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean doesMatch(char closingSymbol, char openingSymbol) {
        return (closingSymbol == ')' && openingSymbol == '(') ||
                (closingSymbol == '}' && openingSymbol == '{') ||
                (closingSymbol == ']' && openingSymbol == '[');
    }

}
