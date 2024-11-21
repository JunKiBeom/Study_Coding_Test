import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        double gpa = 0;

        switch (grade) {
            case "A+": gpa = 4.3; break;
            case "A0": gpa = 4.0; break;
            case "A-": gpa = 3.7; break;
            case "B+": gpa = 3.3; break;
            case "B0": gpa = 3.0; break;
            case "B-": gpa = 2.7; break;
            case "C+": gpa = 2.3; break;
            case "C0": gpa = 2.0; break;
            case "C-": gpa = 1.7; break;
            case "D+": gpa = 1.3; break;
            case "D0": gpa = 1.0; break;
            case "D-": gpa = 0.7; break;
            case "F":  gpa = 0.0; break;
        }
        System.out.printf("%.1f\n", gpa);
    }
}
