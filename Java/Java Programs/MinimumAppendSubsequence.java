public class MinimumAppendSubsequence {
    public static void main(String[] args) {
        String s1="coaching";
        String s2="coding";
        System.out.println(minAppend(s1,s2));
    }

    public static int minAppend(String s1,String s2) {
        int i=0,j=0;

        while(i<s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
            i++;
        }
        return s2.length() - j;
    }
}
