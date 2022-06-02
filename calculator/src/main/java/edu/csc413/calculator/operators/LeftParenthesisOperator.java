package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class LeftParenthesisOperator extends Operator {

    private final int leftPriority = 0; // left parenthesis is given lowest priority

    @Override
    public int priority() {
        return leftPriority;
    }

    // should never end up using executing with a parenthesis with an actual number
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        return null;
    }
}
