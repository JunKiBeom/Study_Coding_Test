class Solution {
    public int solution(int[] num_list) {
        int prod = 1;
        int sum = 0;
        for (int n : num_list) {
            prod *= n;
            sum += n;
        }
        return prod < sum * sum ? 1 : 0;
    }
}