package UnitConversion;

import java.util.Scanner;

public class UnitConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scanner
        System.out.println("Hello, welcome to my unit conversion.");
        
        System.out.println("Type in any amount of kilometers to convert it to miles.");
        double userInput = scanner.nextDouble();
        System.out.println(userInput + " kilometers is equal to " + kilometersToMiles(userInput) + " miles." );
        
        System.out.println("Type in any amount of feet to convert it to meters.");
        userInput = scanner.nextDouble();
        System.out.println(userInput + " feet is equal to " + feetToMeters(userInput) + " meters." );
        
        System.out.println("Type in any amount of gigabytes to convert it to megabytes.");
        userInput = scanner.nextDouble();
        System.out.println(userInput + " gigabytes is equal to " + gigabytesToMegabytes(userInput) + " megabytes." );
        
    }
    // close main

    private static double kilometersToMiles(double kilometers) {
        final double kmToMiFormula = 0.62137;
        return kmToMiFormula * kilometers;
    }
    private static double feetToMeters(double feet) {
        final double ftToMFormula = 0.3048;
        return ftToMFormula * feet;
    }
    private static double gigabytesToMegabytes(double gigabytes) {
        final double gbToMbFormula = 1000;
        return gbToMbFormula * gigabytes;
    }
}
// close class
