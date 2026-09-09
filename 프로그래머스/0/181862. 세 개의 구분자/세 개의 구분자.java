import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);
            
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() > 0) {
                    result.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }
        
        if (sb.length() > 0) {
            result.add(sb.toString());
        }
        
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        
        return result.toArray(new String[0]);
    }
}