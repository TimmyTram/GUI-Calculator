package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class MultiplyOperator extends Operator{

    private final int multiplyPriority = 2;
    @Override
    public int priority() {
        return multiplyPriority;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        int opOneValue = operandOne.getValue();
        int opTwoValue = operandTwo.getValue();
        return new Operand(opOneValue * opTwoValue);
    }
}
