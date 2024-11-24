import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 과목 개수 입력
        int N = scanner.nextInt();
        
        // 점수 배열 입력
        double[] scores = new double[N];
        double maxScore = 0; // 최대 점수 저장
        
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextDouble();
            if (scores[i] > maxScore) {
                maxScore = scores[i]; // 최댓값 갱신
            }
        }
        
        // 새로운 점수 합 계산
        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = (scores[i] / maxScore) * 100; // 점수 조정
            sum += scores[i]; // 합계에 추가
        }
        
        // 새로운 평균 계산
        double newAverage = sum / N;
        
        // 결과 출력
        System.out.println(newAverage);
    }
}
