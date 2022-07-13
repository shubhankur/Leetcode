package Recursion;

public class KthSymbol {
    public static int kthGrammar(int n, int k) {
        if(n == 1 || k == 1){
            return 0;
        }

        // Finding the mid of the nth row
        int mid = (int)Math.pow(2, n - 1) / 2;

        // Check to see if k <= mid
        if(k <= mid){
            // if yes than the answer will be the same integer which is present at k position in for (n - 1)th row
            return kthGrammar(n - 1, k);
        }


        // else it will be the complement of the (k - mid)th position integer of (n - 1)th row
        return kthGrammar(n - 1, k - mid) ^ 1;
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(5,6));


    }
}
