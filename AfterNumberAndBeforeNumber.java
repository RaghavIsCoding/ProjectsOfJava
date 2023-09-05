package MyProjects;
import java.util.Scanner;

public class AfterNumberAndBeforeNumber {

    public static void main(String[] args) {
        // code starts
        Scanner input = new Scanner(System.in);
        // starts
        System.out.println("Enter any number");
        int n = input.nextInt();
        // printing it
        System.out.println("After number of " + n + " is " + ++n);
        System.out.println("Before number of " + (n-1) + " is " + (n-2));
    }
}
