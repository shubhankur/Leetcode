package Recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private Map<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int result =  fib(n-1)+fib(n-2);
        map.put(n,result);
        return result;
    }
}
