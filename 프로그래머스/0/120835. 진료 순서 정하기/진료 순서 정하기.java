import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            int m = Arrays.stream(emergency).max().getAsInt();
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] == m) {
                    answer[j] = i+1;
                    emergency[j] = 0;
                }
            }
        }
        return answer;
    }
}