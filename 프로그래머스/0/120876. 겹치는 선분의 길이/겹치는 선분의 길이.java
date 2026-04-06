class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[201]; // -100~100
        
        for (int[] arr: lines) {
            int start = arr[0] + 100;
            int end = arr[1] + 100;
            
            for (int i = start; i < end; i++)
                cnt[i]++;
        }
        
        for (int i: cnt)
            if (i >= 2) answer++;
        
        return answer;
    }
}