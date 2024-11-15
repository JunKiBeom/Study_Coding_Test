import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스의 수

//        sc.nextLine();

        // 테스트 케이스 반복
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();  // N 값
            Set<Character> set = new HashSet<>();  
            int i = 0;
            int current = 0;

            // 0부터 9까지의 모든 숫자를 볼 때까지
            while (set.size() < 10) {
                i++;
                current = i * n; 
                // 현재 숫자의 각 자릿수를 set에 추가
                for (char c : String.valueOf(current).toCharArray()) {
                    set.add(c);  // 문자 '0'~'9'를 숫자로 변환하여 Set에 추가
                }
            }

            System.out.printf("#%d %d\n", test_case, current);
        }
    }
}
