import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        for (int i = 0; i < 5; i++) {
            tmp += Math.pow(sc.nextInt(),2);
        }
        System.out.println(tmp%10);
    }
}
