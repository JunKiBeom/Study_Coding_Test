import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        char grade;
        switch (score / 10) {
            case 10:  // 100점
            case 9:   // 90 ~ 99점
                grade = 'A';
                break;
            case 8:   // 80 ~ 89점
                grade = 'B';
                break;
            case 7:   // 70 ~ 79점
                grade = 'C';
                break;
            case 6:   // 60 ~ 69점
                grade = 'D';
                break;
            default:  // 0 ~ 59점
                grade = 'F';
                break;
        }

        System.out.println(grade);
    }
}