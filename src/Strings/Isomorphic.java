package Strings;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t){
        if (s.length()!=t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(int i =0;i<s1.length;i++){

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aab","bbb"));
    }
}
