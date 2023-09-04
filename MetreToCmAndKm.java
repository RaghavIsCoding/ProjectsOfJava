package MyProjects; // import your package
import java.util.Scanner;

public class MetreToCentimetreAndKilometre { // write your class name

    public static void main(String[] args) {

        // code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter metres");

        // taking
        float u = sc.nextInt();

        // making
        System.out.println("Metre of " + u + " convert into Centimetre is: " + u*100 + "Cm");
        System.out.println("Metre of " + u + " convert into kilometre is: " + u/1000 + "Km");
    }
}
