import java.util.*;
public class RemoveAnDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,4,2,3,4,4};
        Arrays.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        for( int num:arr){
            set.add(num);

        }
        System.out.println(set);
    }
}
