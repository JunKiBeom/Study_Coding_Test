import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();

        a.append(st.nextToken());
        b.append(st.nextToken());
        br.close();

        a.reverse();
        b.reverse();

        bw.write(String.valueOf(Integer.parseInt(String.valueOf(a)) > Integer.parseInt(String.valueOf(b)) ? a : b));
        bw.flush();
        bw.close();
    }
}