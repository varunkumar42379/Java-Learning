// Parent class
class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
}

// Child class
class AdvancedCalculator extends Calculator {

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Can't divide by zero!");
            return 0;
        }
        return a / b;
    }
}

// Main class to test the calculator
public class Inheritence {
    public static void main(String[] args) {
        // Create object of AdvancedCalculator
        AdvancedCalculator ac = new AdvancedCalculator();

        // Using methods from parent class
        System.out.println("Add: " + ac.add(5,10));        // from Calculator
        System.out.println("Subtract: " + ac.subtract(10, 5)); // from Calculator

        // Using methods from child class
        System.out.println("Multiply: " + ac.multiply(10, 5)); // from AdvancedCalculator
        System.out.println("Divide: " + ac.divide(10, 5));     // from AdvancedCalculator
    }
}