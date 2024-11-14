import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 삼항 연산자를 사용하여 승자 판별
        String winner = (A == 1 && B == 3) || (A == 2 && B == 1) || (A == 3 && B == 2) 
                        ? "A" 
                        : "B";
        
        // 결과 출력
        System.out.println(winner);
    }
}