package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getRow(int row){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if(row>0) {
            list1 = getRow(row-1);
        }
        list2.add(1);
        for(int j=1;j<row;j++){
            list2.add(list1.get(j)+list1.get(j-1));
        }
        if(row>0) list2.add(1);
        return  list2;
    }

    public static void main(String[] args) {
        List list  = getRow(3);
        list.forEach(e->{
            System.out.println(e);
        });
    }
}

