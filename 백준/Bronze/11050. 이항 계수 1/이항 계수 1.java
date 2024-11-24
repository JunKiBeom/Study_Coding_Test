import java.io.*;
import java.util.*;

public class Main {
    static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        br.close();

        bw.write(fact(n) / (fact(r) * fact(n - r)) + "\n");
        bw.close();
    }
}
