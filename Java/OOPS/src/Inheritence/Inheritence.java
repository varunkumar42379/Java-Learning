package Inheritence;

public class Inheritence {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();

        System.out.println("Add: " + ac.add(5, 10));
        System.out.println("Subtract: " + ac.subtract(10, 5));
        System.out.println("Multiply: " + ac.multiply(10, 5));
        System.out.println("Divide: " + ac.divide(10, 5));
    }
}
