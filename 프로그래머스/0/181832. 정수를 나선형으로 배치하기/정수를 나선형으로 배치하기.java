class Solution {
    
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    int N;
    
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        this.N = n;
        
        dfs(0, 0, 1, 0, answer);
        return answer;
    }
    
    private void dfs(int row, int col, int num, int dir, int[][] answer) {
        answer[row][col] = num;
        
        if (num == N * N) return;
        
        int nextRow = row + dx[dir];
        int nextCol = col + dy[dir];
        
        if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= N || answer[nextRow][nextCol] != 0) {
            dir = (dir + 1) % 4;
            nextRow = row + dx[dir];
            nextCol = col + dy[dir];
        }
        
        dfs(nextRow, nextCol, num + 1, dir, answer);
    }
}