class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (diff > Math.abs(array[i] - n)) {
                diff = Math.abs(array[i] - n);
                answer = array[i];
            }
            else if (diff==Math.abs(array[i] - n)) 
                answer = Math.min(answer, array[i]);
        }
        return answer;
    }
}