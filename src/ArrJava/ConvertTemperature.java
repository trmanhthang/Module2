package ArrJava;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Chuyển đổi độ F sang độ C");
            System.out.println("2. Chuyển đổi độ C sang độ F");
            System.out.println("0. Exit");
            System.out.println("Mời bạn chọn");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("độ F sang độ C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("độ C sang độ F: " + celsiusToFahrenheit(celsius));
                    break;
//                case 0:
//                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * (celsius + 32);
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
