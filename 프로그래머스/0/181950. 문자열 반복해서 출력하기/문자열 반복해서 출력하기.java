import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s = st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < a; i++)
            bw.write(s);
        
        br.close();
        bw.close();
    }
}