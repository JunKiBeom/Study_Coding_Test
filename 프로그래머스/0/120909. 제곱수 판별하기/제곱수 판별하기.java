class Solution {
    public int solution(int n) {
        int answer = 0;
        return Math.pow((int)Math.sqrt(n), 2) == n ? 1 : 2;
    }
}