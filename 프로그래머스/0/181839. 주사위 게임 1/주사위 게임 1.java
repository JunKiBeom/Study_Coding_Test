class Solution {
    public int solution(int a, int b) {
        // a와 b가 모두 홀수인 경우
        if (a % 2 != 0 && b % 2 != 0) {
            return (a * a) + (b * b);
        } 
        // a와 b 중 하나만 홀수인 경우
        else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        } 
        // a와 b 모두 홀수가 아닌(짝수인) 경우
        else {
            return Math.abs(a - b);
        }
    }
}