import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int maxi=0;
        for (int i = 1; i < 10; i++) {
            int n = sc.nextInt();
            if (n > max) {
                max = n;
                maxi = i;
            }
        }
        System.out.printf("%d\n%d", max, maxi);
    }
}
