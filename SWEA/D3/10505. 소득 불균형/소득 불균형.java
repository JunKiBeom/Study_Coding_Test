import java.util.*;
import java.util.stream.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수
        sc.nextLine();  // 첫 번째 엔터를 소비

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();  // 배열의 크기
            sc.nextLine();  // 남아있는 엔터를 소비

            String line = sc.nextLine().trim();

            // 공백으로 구분하여 숫자 배열로 변환
            String[] input = line.split("\\s+");
            int sum = 0;
            int cnt = 0;

            // 배열 값 파싱 및 합계 계산
            for (String s : input) {
                int num = Integer.parseInt(s);
                sum += num;
            }

            // 평균 계산
            double avg = (double) sum / input.length;

            // 평균 이하의 값 세기
            for (String s : input) {
                if (Integer.parseInt(s) <= avg) {
                    cnt++;
                }
            }

            // 결과 출력
            System.out.printf("#%d %d\n", test_case, cnt);
        }
    }
}
