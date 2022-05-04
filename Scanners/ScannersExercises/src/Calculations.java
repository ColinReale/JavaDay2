import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        String one = scanner.nextLine();
        int uno = Integer.parseInt(one);

        System.out.println("enter another number:");
        String two = scanner.nextLine();
        int dos = Integer.parseInt(two);
        double un = Double.parseDouble(one);
        double deu = Double.parseDouble(two);

        int addition = uno + dos;
        int subtraction = uno - dos;
        int multiplication = uno * dos;
        double division = un/deu;
        int modulus = uno%dos;



        System.out.println(one + " + " + two + "=" + addition);
        System.out.println(one + " - " + two + "=" + subtraction);
        System.out.println(one + " * " + two + "=" + multiplication);
        System.out.println(one + " / " + two + "=" + division);
        System.out.println(one + " % " + two + "=" + modulus);


    }
}