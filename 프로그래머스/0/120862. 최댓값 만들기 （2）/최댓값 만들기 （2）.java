import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int r1 = numbers[0] * numbers[1];
        int r2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return Math.max(r1, r2);
    }
}