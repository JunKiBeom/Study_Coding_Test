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
            int n = sc.nextInt();
            int[] d = new int[] {2,3,5,7,11};
            int[] arr = new int[] {0,0,0,0,0};

            while (n>1) {
                for (int i=0; i<5; i++) {
                    if (n%d[i]==0) {
                        arr[i] ++;
                        n/=d[i];
                    }
                }
            }
            System.out.println("#"+test_case+" "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
        }
    }
}