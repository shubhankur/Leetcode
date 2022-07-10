package Misc;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> referenceList = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0 || j==i) innerList.add(1);
                else{
                    innerList.add(referenceList.get(j-1)+referenceList.get(j));
                }
            }
            referenceList.clear();
            referenceList.addAll(innerList);
            result.add(innerList);
        }
        return result;
    }

    public static void main(String[] args) {
        List list = generate(5);
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
