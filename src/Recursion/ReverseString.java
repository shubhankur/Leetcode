package Recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void reverseString(char[] s, int first, int last){
        char swap = s[first];
        s[first]= s[last];
        s[last]=swap;
        if (first<s.length/2) {
            reverseString(s, first+1, last-1);
        }
    }

    public static void main(String[] args) {
        String[] s = new String[]{"A"," ","m","a","n",","," ","a"," ","p","l","a","n",","," ","a"," ","c","a","n","a","l",":"," ","P","a","n","a","m","a"};
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
