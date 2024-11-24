import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
            set.add(br.readLine());
        }
        br.close();

        String[] s = set.toArray(new String[0]);

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (String word : s)
            bw.write(word + "\n");
        bw.close();
    }
}