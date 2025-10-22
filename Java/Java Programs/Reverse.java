public class Reverse {
    public static void main(String[] args) {
        int num=1234,Reversed=0;
        while(num!=0){
            Reversed = Reversed *10 + num%10;
            num/=10;
    }
    System.out.println(Reversed);
}
}
