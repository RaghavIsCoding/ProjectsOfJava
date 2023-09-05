package MyProjects;
import java.util.Scanner;

public class FriendlyFriends {

    public static void main(String[] args) {
        // code starts
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello my friend!");

        // asking your name
        System.out.println("What's your name? With your surname.");
        String name = sc.nextLine();

        System.out.println("Wow, " + name + " is looking good");
        System.out.println("How old are you");

        // asking your age
        int age = sc.nextInt();
        System.out.println("That's a good age and you're " + age + " so starts coding\nand do more");
    }
}
