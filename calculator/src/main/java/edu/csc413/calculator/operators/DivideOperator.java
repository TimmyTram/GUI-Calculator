package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class DivideOperator extends Operator{

    private final int dividePriority = 2;

    @Override
    public int priority() {
        return dividePriority;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        int opOneValue = operandOne.getValue();
        int opTwoValue = operandTwo.getValue();
        return new Operand(opOneValue / opTwoValue);
    }
}
