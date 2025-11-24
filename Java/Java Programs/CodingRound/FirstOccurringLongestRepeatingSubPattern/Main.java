package CodingRound.FirstOccurringLongestRepeatingSubPattern;

import java.util.*; // Import the Java utility package for Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n]; // Declare an integer array of size n

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();


        int maxLen = 0; // Variable to store the length of the longest repeating pattern
        int startIdx = -1; // Variable to store the starting index of the longest repeating pattern
        //Before we find any pattern, there is no valid starting index.
        //Using -1 makes it easy to check later if a pattern was found:


        // Check for all possible pattern lengths (minimum length 2)
        for (int len = 2; len <= n - 1; len++) {
            // Loop through all possible starting positions i of the first pattern
            for (int i = 0; i + len <= n; i++) {
                // Loop through all possible starting positions j of the second pattern after i
                for (int j = i + 1; j + len <= n; j++) {
                    boolean match = true; // Assume the patterns match initially

                    // Check element by element if the two patterns are the same
                    for (int k = 0; k < len; k++) {
                        if (arr[i + k] != arr[j + k]) { // If any element is different
                            match = false; // Mark as not matching
                            break; // Exit the innermost loop as no need to check further
                        }
                    }

                    // If a matching pattern is found and its length is greater than current maxLen
                    if (match && len > maxLen) {
                        maxLen = len; // Update the maximum pattern length
                        startIdx = i; // Update the starting index of the longest pattern
                    }
                }
            }
        }

        // After checking all possibilities, print the result
        if (maxLen > 0) { // If a repeating pattern was found
            System.out.println("Pattern length: " + maxLen); // Print the length of the pattern
            System.out.print("Pattern: "); // Print the label "Pattern:"
            // Loop to print the elements of the longest pattern
            for (int i = startIdx; i < startIdx + maxLen; i++) {
                System.out.print(arr[i]); // Print the i-th element of the pattern
                if (i < startIdx + maxLen - 1) { // Add a space if it's not the last element
                    System.out.print(" ");
                }
            }
        } else { // If no repeating pattern was found
            System.out.println("No repeating pattern found (-1)");
        }
    }
}