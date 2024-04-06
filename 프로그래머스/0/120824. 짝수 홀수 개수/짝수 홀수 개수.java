import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = Arrays.stream(num_list).filter(idx -> idx % 2 == 0).toArray();
        return new int[] {answer.length, num_list.length - answer.length};
    }
}