import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<String> st = new Stack<>();

        for (String ss :s.split(" "))
            st.push(ss);
        
        for (int i = 0; !st.isEmpty(); i++) {
            if (st.peek().equals("Z")) {
                st.pop();
                st.pop();
            } else {
                answer += Integer.parseInt(st.pop());
            }
        }
        
        return answer;
    }
}