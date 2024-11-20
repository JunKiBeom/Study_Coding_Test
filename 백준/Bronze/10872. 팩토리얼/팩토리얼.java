import java.util.Scanner;

public class Main {
//    public static int fact(int num) {
//        if (num == 1)
//            return 1;
//        return num * fact(num - 1);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
//        System.out.println(fact(n));
        for (int i = 1; i <= n; i++)
            ans*=i;
        System.out.println(ans);
    }
}