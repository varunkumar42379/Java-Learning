package Inheritence;

// Child class (no public modifier)
class AdvancedCalculator extends Calculator implements SimpleCalcutor {
    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }
}
