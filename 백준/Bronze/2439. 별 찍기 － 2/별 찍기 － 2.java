import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기: N
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
