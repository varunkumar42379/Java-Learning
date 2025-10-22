public class Main {
    public static boolean areCharactersUnique(String str) {
        boolean[] seen=new boolean[256];
        for (char c : str.toCharArray()){
            if(seen[c]){
                return false;
            }
            seen[c]=true;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "abc";
        if(areCharactersUnique (s)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");

        }
    }
}