package IntroductionToJava;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("a: ");

        double b = scanner.nextDouble();
        System.out.println("b: ");

        double c = scanner.nextDouble();
        System.out.println("c: ");

        if (a != 0) {
            double result = (c - b) / a;
            System.out.println("Equation pass with x = %f\n," + result);
        } else {
            if (b == c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
