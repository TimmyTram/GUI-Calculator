package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends Operator {
    private final int subtractPriority = 1;

    @Override
    public int priority() {
        return subtractPriority;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        int opOneValue = operandOne.getValue();
        int opTwoValue = operandTwo.getValue();
        return new Operand(opOneValue - opTwoValue);
    }
}
