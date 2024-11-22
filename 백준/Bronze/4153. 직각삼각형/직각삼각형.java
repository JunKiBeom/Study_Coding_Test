import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 세 변의 길이를 오름차순으로 정렬
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        sc.close();
    }
}
