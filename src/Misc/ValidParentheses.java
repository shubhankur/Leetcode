package Misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i=0;i<s.length();i++){
            if(map.keySet().contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else if(map.values().contains(s.charAt(i))){
                if(stack.empty()) return false;
                char ch = stack.pop();
                if(s.charAt(i)!=map.get(ch)) return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("[{}]"));
    }
}
