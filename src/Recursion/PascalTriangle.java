package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getRow(int row){
        if(row==0) return new ArrayList<Integer>(){{
            add(1);
        }};
        List<Integer> list = getRow(row-1);
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<=row;i++){
            if(i==0 || i==row) result.add(1);
            else result.add(list.get(i-1)+list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List list  = getRow(3);
        list.forEach(e->{
            System.out.println(e);
        });
    }
}

