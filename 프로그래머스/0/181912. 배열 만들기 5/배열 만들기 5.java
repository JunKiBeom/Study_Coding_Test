import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String str: intStrs) {
            String tmp = str.substring(s, s + l);
            if (Integer.parseInt(tmp) > k)
                list.add(Integer.parseInt(tmp));
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}