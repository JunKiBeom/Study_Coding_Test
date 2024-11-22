import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        // 45분 일찍 설정
        M -= 45; // 분에서 45분을 뺌

        if (M < 0) { // 분이 음수가 되면
            M += 60; // 60분을 더해 양수로 변경
            H -= 1;  // 시간에서 1시간 차감
        }

        if (H < 0) { // 시간이 음수가 되면
            H = 23; // 23시로 변경
        }

        // 결과 출력
        System.out.println(H + " " + M);
    }
}
