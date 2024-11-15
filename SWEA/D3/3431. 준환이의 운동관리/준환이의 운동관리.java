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
            int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();
            int ans = L>X ? L-X : L<=X && U>=X ? 0 : -1;
            System.out.println("#"+test_case+" "+ans);
        }
    }
}