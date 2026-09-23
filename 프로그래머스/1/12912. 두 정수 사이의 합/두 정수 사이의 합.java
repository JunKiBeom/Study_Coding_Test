class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        return (long)(Math.abs(a - b) + 1) * (a + b) / 2;
    }
}