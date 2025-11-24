package CodingRound.FrequencyOfEachUniqueScore;

import java.util.*; // Import Java utilities for Scanner, Map, etc.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        System.out.println("Enter"); // Prompt the user to enter the number of elements
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array to store the input numbers

        // Read n integers from the user and store them in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a LinkedHashMap to store numbers and their frequencies
        // LinkedHashMap preserves insertion order
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();

        // Populate the frequency map
        for (int num : arr) {
            // If num is already in map, increment its count, otherwise start with 1
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each number in the order they appear
        boolean first = true; // Flag to control spacing in output

        // Below is the for each loop to read a HahMap
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (!first) System.out.print(" "); // Print space between entries

            System.out.print(entry.getKey() + ":" + entry.getValue()); // Print number:frequency
            first = false; // After first element, set flag to false
        }
        System.out.println(); // Move to the next line after printing frequencies

        // Find the mode (most frequent number)
        int mode = -1; // Variable to store the mode
        int maxfreq = 0; // Variable to store the highest frequency

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey(); // Current number
            int freq = entry.getValue(); // Frequency of the current number

            // If current frequency is higher than maxfreq, or if equal but number is smaller
            if (freq > maxfreq || (freq == maxfreq && num < mode)) {
                maxfreq = freq; // Update the highest frequency
                mode = num; // Update the mode
            }
        }

        System.out.print(mode); // Print the mode
    }
}

