import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {-1, 1, 0, 0}; // 상, 하
    static int[] dx = {0, 0, -1, 1}; // 좌, 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        // 그림 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        int cnt = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    cnt++;
                    max = Math.max(max, bfs(i,j));
                }
            }
        }
        bw.write(cnt + "\n" + max);

        bw.flush();
        bw.close();
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        int rs = 1;

        while (!q.isEmpty()) {
            int [] cur = q.poll(); // current position
            int cy = cur[0];
            int cx = cur[1];

            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
                    if (map[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        rs++;
                        q.add(new int[]{ny, nx});
                    }
                }
            }
        }
        return rs;
    }
}