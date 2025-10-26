import java.util.*;
public class MainAn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (!first) System.out.print(" ");

                System.out.print(entry.getKey() + ":" + entry.getValue());
                first = false;
                }
            System.out.println();

            int mode = -1;
            int maxfreq = 0;
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                int num = entry.getKey();
                int freq = entry.getValue();
                if (freq > maxfreq || (freq == maxfreq && num < mode)) {

                    maxfreq = freq;
                    mode = num;
                }

            }
            System.out.print(mode);
        }
    }