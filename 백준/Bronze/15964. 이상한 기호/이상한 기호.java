import java.util.Scanner;

public class Main {
    public static long func(int a, int b) {
        return (long) (a + b) * (a - b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(func(a,b));
    }
}
