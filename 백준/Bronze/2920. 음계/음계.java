import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[8];

        for (int i = 0; i < 8; i++) {
            notes[i] = sc.nextInt();
        }

        // 판별하기
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 7; i++) {
            if (notes[i] < notes[i + 1]) {
                isDescending = false; // 오름차순이므로 내림차순 아님
            }
            else if (notes[i] > notes[i + 1]) {
                isAscending = false; // 내림차순이므로 오름차순 아님
            }
        }

        System.out.println(isAscending ? "ascending" : isDescending ? "descending" : "mixed");
    }
}
