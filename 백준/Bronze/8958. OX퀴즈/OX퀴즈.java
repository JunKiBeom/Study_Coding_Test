import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int bonus = 0;
            int ans = 0;

            for (char c : s.toCharArray()) {
                if (c == 'O') {
                    ans += 1+bonus;
                    bonus++;
                }
                else bonus=0;
            }
            System.out.println(ans);
        }
    }
}

