class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < rsp.length(); i++) {
            char tmp = rsp.charAt(i);
            if (tmp=='0')
                answer.append(5);
            else if (tmp=='2')
                answer.append(0);
            else
                answer.append(2);
        }
        return answer.toString();
    }
}