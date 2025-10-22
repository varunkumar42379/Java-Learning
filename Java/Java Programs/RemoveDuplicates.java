import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr)
            set.add(num);

        System.out.println(set);
    }
}
