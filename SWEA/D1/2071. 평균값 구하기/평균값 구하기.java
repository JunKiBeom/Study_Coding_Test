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
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            System.out.printf("#%d %d\n", test_case, (int) Math.round(Arrays.stream(ss).mapToInt(Integer::parseInt).average().orElse(0)));
        }
    }
}