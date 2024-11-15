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
            String input = sc.nextLine();
            int year = Integer.parseInt(input.substring(0, 4));
            int month = Integer.parseInt(input.substring(4, 6));
            int day = Integer.parseInt(input.substring(6, 8));

            // 월별 일 수 배열
            int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (month < 1 || month > 12) {
                System.out.printf("#%d -1\n",test_case);
                continue;
            }

            if (day < 1 || day > daysInMonth[month]) {
                System.out.printf("#%d -1\n",test_case);
                continue;
            }

            // 유효한 날짜일 경우
            System.out.printf("#%d %04d/%02d/%02d\n",test_case, year, month, day);
        }
    }
}