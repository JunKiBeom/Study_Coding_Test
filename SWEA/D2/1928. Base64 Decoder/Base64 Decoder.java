import java.util.*;
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
            String encodedString = sc.nextLine();
            
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            String decodedString = new String(decodedBytes);
            
            System.out.printf("#%d %s%n", test_case, decodedString);
        }
    }
}