package Matrix;

import java.util.*;

public class Search2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ;i<matrix.length;i++){
            if(target<matrix[i][matrix[i].length-1]){
                int[] row = matrix[i];
                int start = 0;
                int end = row.length-1;
                while(start<=end){
                    int pos = (start+end)/2;
                    int value = row[pos];
                    if(value==target) return true;
                    else if (target < value) end = pos-1;
                    else start = pos+1;
                }
                return false;
            }
            if(target==matrix[i][matrix[i].length-1]){
                return true;
            }
        }
        return false;
    }

    public int firstUniqueChar(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            if(!map.containsKey(s.charAt(i))){
                list.add(0);
            }
            else {
                list.add(map.get(s.charAt(i)).get(1)+1);
            }
        }
        map.forEach((k,v)->{
            if(v.get(1)!=0) map.remove(k);
        });
        if (map.isEmpty()) return -1;
        int min = Integer.MAX_VALUE;
        for (List<Integer> value : map.values()) {
            if(value.get(0)<min) min = value.get(0);
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3,5}};
        System.out.println(searchMatrix(arr,1));
    }
}
