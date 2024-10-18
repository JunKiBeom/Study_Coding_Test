import java.util.*;

class Solution {
    boolean solution(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        s = s.toLowerCase();
        
        for(char c:s.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);
        
        return hm.get('p')==hm.get('y');
    }
}