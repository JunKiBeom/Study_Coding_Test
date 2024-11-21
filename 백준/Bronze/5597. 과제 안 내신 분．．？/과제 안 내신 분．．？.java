import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int stn = sc.nextInt();
            arr[stn] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}