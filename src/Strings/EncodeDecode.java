package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    public static List<String> encode(List<String> strs) {
        int a = strs.size();
        StringBuilder str = new StringBuilder();
        str.append(a);
        for (int i = 0; i < a; i++) {
            int y = strs.get(i).length();
            str.append(y);
            str.append(strs.get(i));
        }
        return decode(str.toString());
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int a = str.charAt(0)-'0';
        int p = 1;
        for (int i = 0; i < a; i++) {
            int b1 = str.charAt(p)-'0';
            list.add(str.substring(p+1, p + 1 + b1));
            p = p + 1+ b1;
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Arrays.asList("lint","code","love","you"));
        encode(input).forEach(str->{
            System.out.println(str);
        });
    }
}
