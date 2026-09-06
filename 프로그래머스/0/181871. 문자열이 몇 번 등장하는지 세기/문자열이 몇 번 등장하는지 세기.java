import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        Map<String, Integer> freq = new HashMap<>();
        int len = pat.length();
        
        for (int i = 0; i <= myString.length() - len; i++) {
            String sub = myString.substring(i, i + len);
            freq.put(sub, freq.getOrDefault(sub, 0) + 1);
        }
        
        return freq.getOrDefault(pat, 0);
    }
}