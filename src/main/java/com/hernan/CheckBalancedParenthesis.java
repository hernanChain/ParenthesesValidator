package com.hernan;

import static com.hernan.util.ExpressionValidatorUtil.isBalanced;

public class CheckBalancedParenthesis {
    public static void main(String[] args) {
        String[] testCases = {
                "()",      // bien balanceado
                "(()",     // mal balanceado
                "({})",    // bien balanceado
                "(()}",    // mal balanceado
                ")(",      // mal balanceado
                "{[])()]", // mal balanceado
                "()()"     // bien balanceado
        };

        for (String expression : testCases) {
            boolean result = isBalanced(expression);
            System.out.println(expression + ": " + (result ? "bien balanceado" : "mal balanceado"));
        }
    }
}