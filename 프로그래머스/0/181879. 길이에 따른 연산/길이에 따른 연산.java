import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int leng = num_list.length;
        if (leng > 10) {
            return Arrays.stream(num_list).sum();
        }
        else {
            for (int i : num_list)
                answer *= i;
        }
        return answer;
    }
}