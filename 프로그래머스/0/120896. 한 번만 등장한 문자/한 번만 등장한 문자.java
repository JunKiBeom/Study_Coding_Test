import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> cntMap = new HashMap<>();

        for (char c: s.toCharArray())
            cntMap.put(c, cntMap.getOrDefault(c, 0) + 1);

        String answer = "";
        for (char c : cntMap.keySet()) {
            if(cntMap.get(c)==1)
                answer += c;
        }
        char[] tmp = answer.toCharArray();
        Arrays.sort(tmp);

        return new String(tmp);
    }
}