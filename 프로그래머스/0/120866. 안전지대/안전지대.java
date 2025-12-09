import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        // 지뢰 주의 8방향
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
        List<int[]> mine = new ArrayList<>();
        int b = board.length;
        
        // 지뢰 파악
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (board[i][j] == 1) {
                    mine.add(new int[] {i, j});
                }
            }
        }
        
        // 지뢰 주변 1로 마킹
        for (int m = 0; m < mine.size(); m++) {
            int i = mine.get(m)[0];
            int j = mine.get(m)[1];
            for (int n = 0; n < dx.length; n++) {
                if (dx[n] + i >= 0 && dy[n] + j >= 0 
                    && dx[n] + i <= b - 1 
                    && dy[n] + j <= b - 1) {
                    board[dx[n] + i][dy[n] + j] = 1;
                }
            }
        }
        
        // 안전지대 파악
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (board[i][j] == 0)
                    answer++;
            }
        }
        
        return answer;
    }
}