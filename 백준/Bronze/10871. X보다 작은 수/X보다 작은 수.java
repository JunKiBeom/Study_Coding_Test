import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int l : list) {
            if (l<x)
                System.out.printf("%d ", l);
        }
    }
}