import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> l = new ArrayList<>();
        
        for(String s: myString.split("x", -1))
            l.add(s.length());
        
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}