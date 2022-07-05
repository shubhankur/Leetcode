package Misc;

public class PerfectSquare {
        public static boolean isPerfectSquare(int num)
        {
            long first= 1;
            long last= num;
            while(first<=last)
            {
                long mid= first+((last-first)/2);
                long mid1= mid*mid;  //323
                if(num== mid1)
                {
                    return true;
                }
                else if(num<mid1)
                {
                    last= mid-1;    //324
                }
                else{
                    first= mid+1;  //324
                }
            }
            return false;
        }


    public static void main(String[] args) {
        System.out.println(isPerfectSquare(104976));
    }
}
