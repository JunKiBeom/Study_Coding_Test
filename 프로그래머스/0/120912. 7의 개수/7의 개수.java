class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int tmp = 0;
        
        for (int i=0;i<array.length;i++) {
            tmp = array[i];

            while (tmp > 0) {
                if (tmp%10==7) answer++;
                tmp/=10;
            }
        }
        
        return answer;
    }
}