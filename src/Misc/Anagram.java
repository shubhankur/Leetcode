package Misc;

import java.util.Locale;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Anagram","Ngarama"));
    }
}
