import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                break;
            }
            else {
                n -= 3;
                cnt++;
            }
            if (n < 0)
                cnt = -1;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}