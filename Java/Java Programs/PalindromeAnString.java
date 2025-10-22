public class PalindromeAnString {
    public static void main(String[] args) {
        String str="varun";
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}
