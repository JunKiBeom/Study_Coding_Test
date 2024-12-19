class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        int odd_sum = 0;
        int even_sum = 0;
            
        for (int i: num_list) {
            if (cnt % 2 == 0)
                even_sum += i;
            else
                odd_sum += i;
            cnt++;
        }
        return Math.max(even_sum, odd_sum);
    }
}