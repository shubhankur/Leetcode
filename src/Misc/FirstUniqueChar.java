package Misc;

import java.util.*;
import java.util.stream.Collectors;

public class FirstUniqueChar {
    public static int firstUniqueChar(String s) {
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
            map.put(s.charAt(i),list);
        }
        //Map<Character,Integer> newMap = map.entrySet().stream().filter(k -> k.getValue().get(1)==0).collect(Collectors.toMap(x->x.getKey(),x -> x.getValue().get(0)));
//        for(Map.Entry<Character,List<Integer>> entry : map.entrySet()){
//            if(entry.getValue().get(1)>0){
//                map.remove(entry.getKey());
//            }
//        }
        Iterator<Map.Entry<Character,List<Integer>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character,List<Integer>> entry = iterator.next();
            if(entry.getValue().get(1)>0){
                iterator.remove();
            }
        }
        if (map.isEmpty()) return -1;
        int min = Integer.MAX_VALUE;
        for (List<Integer> value : map.values()) {
            if(value.get(0)<min) min = value.get(0);
        }
        return min;
    }

    public static int firstUniqChar(String s) {
        boolean flag;
        for(int i = 0;i<s.length();i++){
            flag=false;
            if(s.charAt(i)=='_') continue;
            for(int j =i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)) {
                    s = s.replace(s.charAt(i),'_');
                    j=s.length();
                    flag=true;
                }
            }
            if(!flag)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
