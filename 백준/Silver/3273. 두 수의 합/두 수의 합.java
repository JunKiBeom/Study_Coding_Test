import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int x = sc.nextInt();

        // 수열 정렬
        Collections.sort(list);

        // 투 포인터 기법
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == x) {
                cnt++;  // 합이 x와 같으면 카운트
                left++;
                right--;
            } else if (sum < x) {
                left++;  // 합이 x보다 작으면 왼쪽 포인터를 오른쪽으로
            } else {
                right--; // 합이 x보다 크면 오른쪽 포인터를 왼쪽으로
            }
        }
        
        System.out.println(cnt);
    }
}
