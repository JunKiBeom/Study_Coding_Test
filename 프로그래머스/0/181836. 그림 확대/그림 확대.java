import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        
        for (String p: picture) {
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < p.length(); i++) {
                char ch = p.charAt(i);
                for (int j = 0; j < k; j++) {
                    sb.append(ch);
                }
            }
            
            for (int j = 0; j < k; j++) {
                answer.add(sb.toString());
            }
        }
        return answer.toArray(new String[0]);
    }
}