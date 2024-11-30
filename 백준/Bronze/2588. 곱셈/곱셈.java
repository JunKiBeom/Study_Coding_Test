import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int bb = b;

        while (bb > 0) {
            bw.write(a * (bb % 10) + "\n");
            bb /= 10;
        }
        bw.write(a * b + "");
        bw.close();
    }
}