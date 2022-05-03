import java.util.Scanner;

public class VariableInputs {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text");
        String one = scanner.nextLine();

        System.out.println("Enter an integer");
        int two = Integer.valueOf(scanner.nextLine());


        System.out.println("Enter a double");
        double three = Double.valueOf(scanner.nextLine());


        System.out.println("Enter a boolean value");
        boolean four = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + one);
        System.out.println("Your integer is " + two);
        System.out.println("Your double is " + three);
        System.out.println("Your boolean is " + four);
    }
}