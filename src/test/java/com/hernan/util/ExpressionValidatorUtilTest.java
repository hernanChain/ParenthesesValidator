package com.hernan.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionValidatorUtilTest {

    @Test
    void testBalancedExpressions() {
        assertTrue(ExpressionValidatorUtil.isBalanced("()"));
        assertTrue(ExpressionValidatorUtil.isBalanced("({[]})"));
        assertTrue(ExpressionValidatorUtil.isBalanced("()[]{}"));
        assertTrue(ExpressionValidatorUtil.isBalanced("({[()]})"));
    }

    @Test
    void testUnbalancedExpressions() {
        assertFalse(ExpressionValidatorUtil.isBalanced("("));
        assertFalse(ExpressionValidatorUtil.isBalanced("({[})]"));
        assertFalse(ExpressionValidatorUtil.isBalanced("([)]"));
        assertFalse(ExpressionValidatorUtil.isBalanced("((())"));
        assertFalse(ExpressionValidatorUtil.isBalanced(")("));
    }

    @Test
    void testEmptyString() {
        assertTrue(ExpressionValidatorUtil.isBalanced(""));
    }

    @Test
    void testIrrelevantCharacters() {
        assertTrue(ExpressionValidatorUtil.isBalanced("a(b)c{d}[e]"));
        assertFalse(ExpressionValidatorUtil.isBalanced("a(b{c]"));
    }


}