import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();

        boolean[] isPrime = new boolean[N + 1];
        isPrime[0] = isPrime[1] = true; // 0과 1은 소수가 아님

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) continue; // 이미 소수가 아님이 판명된 수는 건너뜀
            if (i >= M) bw.write(i+"\n");
            for (int j = i * 2; j <= N; j += i) {
                isPrime[j] = true; // i의 배수는 소수가 아님
            }
        }

        bw.flush();
        bw.close();
    }
}