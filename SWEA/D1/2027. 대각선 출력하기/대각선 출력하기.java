import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        //Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i) 
                    System.out.print("#");
                else System.out.print("+");
            }
            System.out.print("\n");
        }
    }
}
