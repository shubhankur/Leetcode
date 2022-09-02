package Misc;

public class CheckPower {
    public static boolean checkPower(int n, int k){
        double var = n;
        boolean flag = true;
        while(var>k){
            var = Math.sqrt(var);
            if(var%k!=0){
                flag = false;
                break;
            }
        }
        if(var%k!=0) return false;
        if(!flag) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.print(checkPower(16,2));
    }
}
