class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[0];

        for (int i = 0; i < k - 1; i++) {
            answer = numbers[(answer + 1) % numbers.length];
        }

        return answer;
    }
}