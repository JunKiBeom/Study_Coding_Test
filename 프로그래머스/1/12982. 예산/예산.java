class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        java.util.Arrays.sort(d);
        
        for (int dd: d) {
            if (budget >= dd) {
                budget -= dd;
            } else {
                break;
            }
            answer++;
        }
        return answer;
    }
}