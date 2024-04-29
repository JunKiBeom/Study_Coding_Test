class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 48;
            if (tmp != 0 && tmp % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}