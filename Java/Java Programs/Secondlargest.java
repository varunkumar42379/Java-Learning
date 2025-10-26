import java.util.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 4};
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                        first=num;
            }else if (num>second && num!=first) {
                second=num;

            }
        }
        System.out.println(second);
    }
}

