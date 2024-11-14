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
            String line = sc.nextLine();  // 한 줄씩 입력 받기
            String[] numbers = line.split(" ");  // 공백으로 구분

            int max = Integer.MIN_VALUE;
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (num > max)
                    max = num;
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}