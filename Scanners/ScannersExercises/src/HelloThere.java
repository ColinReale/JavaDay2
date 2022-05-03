import java.util.Scanner;

public class HelloThere {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");
        String one = scanner.nextLine();
        System.out.println("Wow, interesting! Tell me more!");
        String two = scanner.nextLine();
        System.out.println("Thank you for sharing that with me. So long my friend.");
        String three = scanner.nextLine();
    }
}