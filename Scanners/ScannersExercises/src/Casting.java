import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {
        double doble = 112.35;
        int singular = (int) doble;
        System.out.println("Double: " + doble);
        System.out.println("int: " + singular);

        String cadena = "49";
        int intCadena = Integer.parseInt(cadena);
        System.out.println("The string value is: " + cadena);
        System.out.println("The integer value is " + intCadena);
    }
}