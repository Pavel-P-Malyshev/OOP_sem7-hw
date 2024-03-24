package oop7_hw;

public class CalculatableFactory implements ICalculatableFactory {
    public Calculatable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
