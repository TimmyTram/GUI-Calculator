package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class AddOperator extends Operator{
    private final int addPriority = 1; // final because add's priority never changes in PEMDAS

    @Override
    public int priority() {
        return addPriority;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        /*
            Note: This could be done as a one liner since I doubt the add operation ever change,
            but in terms of readability for other people I will use the three liner.
         */
        // return new Operand(operandOne.getValue() + operandTwo.getValue());

        int opOneValue = operandOne.getValue();
        int opTwoValue = operandTwo.getValue();
        return new Operand(opOneValue + opTwoValue);
    }
}
