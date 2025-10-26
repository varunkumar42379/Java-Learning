public class MissingLetter {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int n=arr.length+1;
        int total=n*(n+1)/2;

        for(int num:arr){
            total -=num;

        }
        System.out.print(total);



    }
}
