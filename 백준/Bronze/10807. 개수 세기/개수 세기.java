import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int x = sc.nextInt();

        for (int l : list) {
            if (l==x)
                cnt++;
        }
        System.out.println(cnt);
    }
}