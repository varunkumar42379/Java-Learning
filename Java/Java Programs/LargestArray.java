public class LargestArray {
    public static void main(String[] args) {
        int[] arr={1,3,43,5};
        int Largest=arr[0];
        for(int num:arr){
            if(num >Largest){
                   Largest=num;
}
        }
    System.out.println(Largest);
}
}