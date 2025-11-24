import java.util.*;
public class RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ // we  used for to iterate through arr upto nth length
            arr[i]=sc.nextInt();
        }
        sc.close();


        // Create a LinkedHashMap object to store key value in LinkedHashMap
        // Map - interface used to store Key-Value Pairs
        // Hash - it is a technique added to Map efficiency and flexibility while storing
        // Linked - Again add Linked to HashMap maintains the insertion order of elements in the map

        Map<Integer,Integer> freqMap = new LinkedHashMap<>();

// Loop through each element of the array arr
        for(int num : arr){ // for each reads every value from arr into num
            // Update the frequency of num in the map
            // If num is not in map, getOrDefault returns 0, then we add 1
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

// Flag to help print the map entries with spaces between them
        boolean first = true;

// Loop through all entries (key-value pairs) in the map
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
            // If this is not the first entry, print a space before printing
            if (!first) System.out.print(" ");

            // Print the current key and its frequency in the format key:value
            System.out.print(entry.getKey() + ":" + entry.getValue());

            // After printing the first entry, set first to false
            first = false;
        }

// Print a newline after printing all frequency entries
        System.out.println();

// Initialize mode to -1 (will store the number with highest frequency)
// Initialize Max to 0 (will store the highest frequency)
        int mode = -1;
        int Max = 0;

// Iterate through all entries key-value pair of Map
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
            // Get the current number (key)
            int num = entry.getKey();

            // Get the frequency of the current number (value)
            int Freq = entry.getValue();

            // If current frequency is greater than Max, or frequencies tie and num < mode
            // then update Max and mode
            if(Freq > Max || (Freq == Max && num < mode)){
                Max = Freq;
                mode = num;
            }
        }

// Print the mode (the number with highest frequency, smallest if tie(equal frequency)  )
        System.out.println(mode);




    }
}


//        Map<Integer,Integer> freqMap=new LinkedHashMap<>();
//        for(int num:arr){//for each read every value form arr in num
//                freqMap.put(num, freqMap.getOrDefault(num,0)+1);
//        }
//        boolean first=true;
//        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()) {
//            if (!first) System.out.print(" ");
//            System.out.print(entry.getKey() + ":" + entry.getValue());
//            first = false;
//        }
//        System.out.println();
//
//        int mode=-1;
//        int Max=0;
//        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()) {
//            int num= entry.getKey();
//            int Freq=entry.getValue();
//            if(Freq>Max || (Freq==Max && num<mode)){
//                Max=Freq;
//                mode=num;
//            }
//        }
//        System.out.println(mode);
//
//
//
