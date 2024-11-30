import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = Arrays.stream(num_list).sorted().toArray();
        return Arrays.copyOfRange(answer, 0, 5);
    }
}