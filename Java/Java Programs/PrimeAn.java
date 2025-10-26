public class PrimeAn {
    public static void main(String[] args) {
        int num = 55;
        boolean isprime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isprime = false;
            }

        }
            System.out.print(isprime);
        }
}
