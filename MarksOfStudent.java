package MyProjects;
import java.util.Scanner;

public class MarksOfStudent {

    public static void main(String[] args) {

        // code starts
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in English: ");
        int EnglishMarks = sc.nextInt();

        System.out.println("Enter your marks in Mathematics: ");
        int MathsMarks = sc.nextInt();

        System.out.println("Enter your marks in Science: ");
        int ScienceMarks = sc.nextInt();

        System.out.println("Enter your marks in Computer Science: ");
        int ComputerScienceMarks = sc.nextInt();

        // final
        float TotalMarksOfStudent = EnglishMarks + MathsMarks + ScienceMarks + ComputerScienceMarks /(100*4);
        System.out.println("Your total marks are " + (int) TotalMarksOfStudent + " out of 300");
    }
}
