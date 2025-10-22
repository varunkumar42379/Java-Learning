public class PrimeAnNumber {
    public static void main(String[] args) {
        int num=5;
        boolean isprime=true;
        for (int i=2 ; i<=Math.sqrt(num);i++){
            if (num%i ==0){
                isprime = false;
                break;
            }

        }
        System.out.println(isprime);
    }
}
