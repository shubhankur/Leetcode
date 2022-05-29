package Misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextSmallest {
    public static int[] finalPrices(int[] prices) {
        Map<Integer,Integer> result = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<prices.length;i++){
            if(stack.empty()){
                stack.push(prices[i]);
            }
            else{
                while(!stack.empty() && prices[i]<stack.peek()){
                    result.put(stack.pop(),prices[i]);
                }
                stack.push(prices[i]);
            }
        }
        result.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
        return prices;
    }

    public static void main(String[] args) {
        finalPrices(new int[]{8,4,6,2,3});
    }
}