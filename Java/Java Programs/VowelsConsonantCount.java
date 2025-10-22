public class VowelsConsonantCount {
    public static void main(String[] args) {
        String str = "Hello world";
        int Vowels = 0, Consonants = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU.".indexOf(c) != -1) {
                Vowels++;
            } else if (Character.isLetter(c)) {
                Consonants++;
            }
        }
        System.out.println("vowels:"+Vowels+ ",Consonants:"+Consonants);
    }
}
