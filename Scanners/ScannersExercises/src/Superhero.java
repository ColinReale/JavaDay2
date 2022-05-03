import java.util.Scanner;

public class Superhero {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero");
        String a = "Who is the hero of this story?";
        System.out.println(a);
        String one = scanner.nextLine();
        String b = "What is their super power (in canon ONLY)?";
        System.out.println(b);
        String two = scanner.nextLine();

        String c = "There once was a superhero named ";
        String d = ", who CANONICALLY had the power of ";
        System.out.println("Here's the story");
        System.out.println(c + one + d + two);
        String e = "As they grew older, ";
        String f = " saw that the world needed them.";
        System.out.println(e + one + f);
        String g = " used their ability to ";
        String h = " to save the world.";
        System.out.println(one + g + two + h);
    }
}