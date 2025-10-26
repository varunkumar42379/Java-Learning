

public class UpperAnlower {
    public static void main(String[] args) {
        String input = "Hello World";

        StringBuilder string = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (i % 2 == 0) {
                string.append(Character.toUpperCase(c));
            } else {
                string.append(Character.toLowerCase(c));
            }
        }
            System.out.print("alternative: " +string.toString());


        }
    }
