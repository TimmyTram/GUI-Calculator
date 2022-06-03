package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class RightParenthesisOperator extends Operator {

    private final int rightPriority = 0; // right parenthesis is given the lowest priority

    @Override
    public int priority() {
        return rightPriority;
    }

    // should never end up using executing with a parenthesis with an actual number
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        return null;
    }
}
