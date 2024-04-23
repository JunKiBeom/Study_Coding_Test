class Solution {
    public String solution(int age) {
        StringBuffer answer = new StringBuffer();
        String tmp = String.valueOf(age);
        for (int i = 0; i < tmp.length(); i++) {
            char c = (char) ((int) tmp.charAt(i) + 49);
            answer.append(c);
        }
        return answer.toString();
    }
}