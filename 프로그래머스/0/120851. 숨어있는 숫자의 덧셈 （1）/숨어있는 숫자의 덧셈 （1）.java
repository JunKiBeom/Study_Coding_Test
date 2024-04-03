class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String intStr = my_string.replaceAll("[^0-9]", "");

        for (int i = 0; i < intStr.length(); i++) {
            // 입력 값 첫자리부터 int형 변환하여 더하기
            answer += (intStr.charAt(i) - '0');
        }
        return answer;
    }
}