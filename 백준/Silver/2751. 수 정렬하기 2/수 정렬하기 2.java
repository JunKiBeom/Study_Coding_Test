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
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++)
            l.add(Integer.parseInt(br.readLine()));
        br.close();

        Collections.sort(l);

        for (int i : l)
            bw.write(i + "\n");
        bw.close();
    }
}
