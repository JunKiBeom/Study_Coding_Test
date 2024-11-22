import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long s = a * b * c;
        while (s != 0) {
            arr[(int) (s%10)]++;
            s/=10;
        }
        for (int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}

