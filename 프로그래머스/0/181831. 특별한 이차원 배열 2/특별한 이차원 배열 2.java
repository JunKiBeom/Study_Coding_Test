class Solution {
    public int solution(int[][] arr) {
        int cnt = 0;
        int l = arr.length;
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (arr[i][j] == arr[j][i])
                    cnt++;
            }
            if (cnt == l * l)
                return 1;
        }
        return 0;
    }
}