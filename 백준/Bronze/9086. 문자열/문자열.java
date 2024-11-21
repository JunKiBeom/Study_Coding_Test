import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int T = sc.nextInt();
        sc.nextLine(); // 남아있는 개행 문자 소비

        for (int t = 0; t < T; t++) {
            // 문자열 입력
            String str = sc.nextLine();

            // 첫 글자와 마지막 글자 추출
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            // 결과 출력
            System.out.printf("%c%c\n", first, last);
        }
    }
}
