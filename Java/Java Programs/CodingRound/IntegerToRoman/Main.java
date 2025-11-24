package CodingRound.IntegerToRoman; // Package declaration (optional, depends on your project structure)

import java.util.*; // Import Java utilities for Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.println("Enter a number: "); // Prompt the user to enter an integer
        int n = sc.nextInt(); // Read the integer input from the user
        sc.close(); // Close the Scanner to free system resources

        // Arrays storing the integer values and their corresponding Roman numeral symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        StringBuilder roman = new StringBuilder(); // StringBuilder to build the Roman numeral string efficiently

        // Loop through each value in the array
        for (int i = 0; i < values.length; i++) {
            // While the current number n is greater than or equal to the value
            while (n >= values[i]) {
                roman.append(symbols[i]); // Append the corresponding Roman numeral to the result
                n -= values[i]; // Subtract the value from n
            }
        }

        // Print the final Roman numeral
        System.out.println(roman.toString());
    }
}