import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}