import java.util.Scanner;

public class Main {
    // 소수 판별 함수
    public static boolean isPrime(int n) {
        if (n < 2) return false; // 0과 1은 소수가 아님

        for (int i = 2; i <= Math.sqrt(n); i++) { // √n까지만 검사
            if (n % i == 0) return false; // 나누어떨어지면 소수가 아님
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) cnt++;
        }

        System.out.println(cnt);
    }
}
