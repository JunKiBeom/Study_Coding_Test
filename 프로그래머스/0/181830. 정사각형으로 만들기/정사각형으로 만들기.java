import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        int max = Math.max(row, col);
        int[][] answer = new int[max][max];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Arrays.copyOf(arr[i], max);
        }
        
        return answer;
    }
}