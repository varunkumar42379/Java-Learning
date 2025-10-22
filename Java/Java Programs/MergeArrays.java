import java.util.Arrays;
public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] Merged=new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,Merged,0,arr1.length);
        System.arraycopy(arr2,0,Merged, arr1.length,arr2.length);

        System.out.println("Merged Array: " + Arrays.toString(Merged));
    }
}
