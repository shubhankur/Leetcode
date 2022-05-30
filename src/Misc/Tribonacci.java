package Misc;

import java.util.HashMap;
import java.util.Map;

public class Tribonacci {
    int[] arr;
    public int tribonacci(int n) {
        this.arr = new int[n];
        return trib(n);
    }
    public int trib(int n){
        int result;
        if(n==0) result = 0;
        else if(n==1 || n==2) result = 1;
        else if(arr[n]!=0) result = arr[n];
        else {
            result = trib(n - 3) + trib(n - 2) + trib(n - 1);
            arr[n] = result;
        }
        return result;
    }
}
