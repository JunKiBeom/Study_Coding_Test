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
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i % 2 == 0 ? -i : i;
            }
            System.out.printf("#%d %d\n",test_case, sum);
        }
    }
}