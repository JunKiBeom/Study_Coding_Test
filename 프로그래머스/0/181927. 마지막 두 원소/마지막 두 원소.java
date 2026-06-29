import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int idx = num_list.length - 1;
        int[] answer = Arrays.copyOf(num_list, idx + 2);
        
        if (answer[idx] > answer[idx - 1])
            answer[idx + 1] += answer[idx] - answer[idx - 1];
        else
            answer[idx + 1] += answer[idx] * 2;
        
        return answer;
    }
}