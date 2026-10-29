class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i ++) {
            int tmp = 0;
            for (int j = i; j <=n; j++) {
                tmp += j;
                if (tmp == n) {
                    System.out.println(j);
                    answer++;
                }
                else if (tmp > n) {
                    break;
                }
            }
        }
        
        return answer;
    }
}