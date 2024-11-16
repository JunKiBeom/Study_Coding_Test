import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        // 첫 번째 엔터 키를 소비하는 부분 추가
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            String mem = sc.nextLine();
            char bit = '0';
            int cnt = 0;

            for (int i = 0; i < mem.length(); i++) {
                if (mem.charAt(i) != bit) {
                    cnt++;
                    bit = mem.charAt(i);
                }
            }
            System.out.printf("#%d %d\n", test_case, cnt);
        }
    }
}