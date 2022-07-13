package Recursion;

public class Power {
    public static double myPow(double x, int n) {
        if(n>0){
            return calculate(x,n);
        }
        else{
            return 1/calculate(x,-1*n);
        }
    }
    public static double calculate(double x, int n) {
        if(n==1) return x;
        return x*myPow(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(myPow(0.00001,2147483647));

    }

}
