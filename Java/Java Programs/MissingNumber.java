public class MissingNumber {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3, 0, 1, 4, 5};

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        int MissingNumber = expectedSum - actualSum;

        System.out.println("missing number:" +MissingNumber);

    }
}
