package Misc;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            list2.add(1);
            for(int j=1;j<i;j++){
                list2.add(list1.get(j-1)+list1.get(j));
            }
            if(i!=0) list2.add(1);
            list1.clear();
            list1.addAll(list2);
            list2.clear();
        }
        return list1;
    }

    public static void main(String[] args) {
        List list = getRow(5);
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
