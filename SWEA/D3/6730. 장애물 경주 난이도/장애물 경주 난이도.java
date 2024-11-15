import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        // 첫 번째 엔터 키를 소비하는 부분 추가
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int[] heights = new int[N];

            for (int i = 0; i < N; i++)
                heights[i] = sc.nextInt();

            int maxUp = 0;  // 올라갈 때 최대 높이 변화
            int maxDown = 0;  // 내려갈 때 최대 높이 변화

            for (int i = 0; i < N - 1; i++) {
                int diff = heights[i + 1] - heights[i];
                if (diff > 0) {
                    maxUp = Math.max(maxUp, diff);  // 올라갈 때 최대 높이 변화 갱신
                }
                else {
                    maxDown = Math.max(maxDown, -diff);  // 내려갈 때 최대 높이 변화 갱신
                }
            }
            System.out.printf("#%d %d %d\n",test_case,maxUp, maxDown);
        }
    }
}