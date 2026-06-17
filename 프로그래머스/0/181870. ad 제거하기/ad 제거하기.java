import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> l = new ArrayList<>();
        
        for (String s : strArr)
            if (!s.contains("ad"))
                l.add(s);
        
        return l.toArray(new String[0]);
    }
}