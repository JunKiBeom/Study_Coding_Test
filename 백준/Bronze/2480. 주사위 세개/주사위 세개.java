import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        if (a == b && b == c) {
            // 모두 같은 눈
            bw.write(10000 + a * 1000 + "");
        } else if (a == b || b == c || a == c) {
            // 같은 눈 2개
            int same = (a == b) ? a : (b == c) ? b : c;
            bw.write(1000 + same * 100 + "");
        } else {
            // 모두 다른 눈
            int max = Math.max(a, Math.max(b, c));
            bw.write(max * 100 + "");
        }

        bw.flush();
        bw.close();
    }
}