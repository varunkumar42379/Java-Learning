import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReversingArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int arr2[] = new int[arr.length];
        int index = 0;

        for (int i = arr.length-1; i >=0; i--) {
            arr2[index++] = arr[i];
        }
        for (int num : arr2) {
            System.out.print(num);
        }
    }
    }

