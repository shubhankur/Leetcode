package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
//    public static List<Integer> getRow(int row){
//        if(row==0) return new ArrayList<Integer>(){{
//            add(1);
//        }};
//        List<Integer> list = getRow(row-1);
//        List<Integer> result = new ArrayList<>();
//        for(int i = 0;i<=row;i++){
//            if(i==0 || i==row) result.add(1);
//            else result.add(list.get(i-1)+list.get(i));
//        }
//        return result;
//    }
public static List<Integer> getRow(int rowIndex) {
    if(rowIndex == 0) return new ArrayList<>(Arrays.asList(1));
    List<Integer> result = getRow(rowIndex-1);
    List<Integer> list = new ArrayList();
    for (int i = 0;i<=rowIndex;i++){
        if(i==0 || i==rowIndex) list.add(1);
        else list.add(result.get(i-1)+result.get(i));
    }
    return list;

}

    public static void main(String[] args) {
        List list  = getRow(3);
        list.forEach(e->{
            System.out.println(e);
        });
    }
}

