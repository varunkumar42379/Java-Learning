// Parent class
class CalculatorPo {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b,int c) {
        return a - b - c;
    }
}

// Child class
class AdvancedCalculatorPo extends CalculatorPo {

//    public int subtract(int a, int b) {
//        return a * b;
//    }

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
public class Polymorphism {
    public static void main(String[] args) {
        // Create object of AdvancedCalculator
      //  AdvancedCalculatorPo ac = new AdvancedCalculatorPo();

        AdvancedCalculatorPo ac = new AdvancedCalculatorPo();

        // Using methods from parent class
        System.out.println("Add: " + ac.add(5,10));        // from Calculator
        System.out.println("Subtract: " + ac.subtract(10, 5)); // from Calculator

        // Using methods from child class
        System.out.println("Multiply: " + ac.multiply(10, 5)); // from AdvancedCalculator
        System.out.println("Divide: " + ac.divide(10, 5));     // from AdvancedCalculator
    }
}