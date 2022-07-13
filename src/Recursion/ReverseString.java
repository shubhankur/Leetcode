package Recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
//    public static void reverseString(char[] s, int first, int last){
//        char swap = s[first];
//        s[first]= s[last];
//        s[last]=swap;
//        if (first<s.length/2) {
//            reverseString(s, first+1, last-1);
//        }
//    }

    public static void reverseString(char[] s, int i, int f){
        if(i>=f) return;
        char swap = s[i];
        s[i]=s[f];
        s[f]=swap;
        reverseString(s, i+1, f-1);
    }
    public static void main(String[] args) {
        String[] s = new String[]{"h","e","l","l","o"};
        char[] ch = new char[s.length];
        for(int i =0;i<s.length;i++){
            ch[i]=s[i].charAt(0);
        }
        reverseString(ch,0,ch.length-1);
        for (char ch2 : ch){
            System.out.println(ch2);
        }
    }
}
