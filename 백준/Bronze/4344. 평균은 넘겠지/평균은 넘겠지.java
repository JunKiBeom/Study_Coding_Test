import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] score = new int[n];
            double avg = 0;

            for (int j = 0; j < n; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                avg += score[j];
            }
            avg /= n;

            int cnt = 0;
            for (int j = 0; j < n; j++)
                cnt += score[j] > avg ? 1 : 0;

            bw.write(String.format("%.3f", (double) cnt / n * 100) + "%\n");
        }
        br.close();
        bw.close();
    }
}