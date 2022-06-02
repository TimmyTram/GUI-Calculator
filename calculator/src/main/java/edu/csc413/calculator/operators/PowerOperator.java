package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {

    private int powerPriority = 3;

    @Override
    public int priority() {
        return powerPriority;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        int opOneValue = operandOne.getValue();
        int opTwoValue = operandTwo.getValue();
        return new Operand((int) Math.pow(opOneValue, opTwoValue));
    }
}
