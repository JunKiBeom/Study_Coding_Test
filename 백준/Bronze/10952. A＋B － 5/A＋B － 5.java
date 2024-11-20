import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = -1;
        while (sum != 0) {
            sum = sc.nextInt() + sc.nextInt();
            if (sum != 0) System.out.println(sum);
            else break;
        }
    }
}