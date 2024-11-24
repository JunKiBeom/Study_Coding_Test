import java.util.Scanner;

public class Main {

    // 유클리드 호제법으로 최대공약수 계산
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수 계산
    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 최대공약수와 최소공배수 계산
        int gcd = gcd(a, b);
        int lcm = lcm(a, b, gcd);

        // 결과 출력
        System.out.printf("%d\n%d",gcd, lcm);
    }
}
