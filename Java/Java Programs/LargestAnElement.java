public class LargestAnElement {
    public static void main(String[] args) {
        int[] num = {55, 33, 22, 44, 55};
        int largest = num[0];
        for (int arr : num) {
            if (arr > largest) {
                largest = arr;
            }
        }
        System.out.println(largest);
    }
}
