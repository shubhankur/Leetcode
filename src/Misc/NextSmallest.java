package Misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextSmallest {
    public static int[] finalPrices(int[] prices) {
        Map<Integer,Integer> result = new HashMap<>();
        int[] arr = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<prices.length;i++){
            if(stack.empty()){
                stack.push(prices[i]);
            }
            else{
                while(!stack.empty() && prices[i]<stack.peek()){
                    int n = stack.pop();
                    result.put(n,prices[i]);
                    for(int j =0;j<prices.length;j++){
                        if (prices[j]==n){
                            arr[j]=n-prices[i];
                            break;
                        }
                    }
                }
                stack.push(prices[i]);
            }
        }
        result.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
        return arr;
    }

    public static void main(String[] args) {
        finalPrices(new int[]{8,4,6,2,3});
    }
}