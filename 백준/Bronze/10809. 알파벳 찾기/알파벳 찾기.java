import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> alp = new HashMap<>();

        // -1로 초기화
        for (char c = 'a'; c <= 'z'; c++)
            alp.put(c, -1);

        // 문자열을 순회하며 알파벳의 위치 저장
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alp.get(c) == -1) { // 처음 등장한 경우만 위치 저장
                alp.put(c, i);
            }
        }

        // 결과 출력
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(alp.get(c) + " ");
        }
    }
}
