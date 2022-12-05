package IntroductionToJava;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số tiền (USD): ");
        usd = input.nextInt();

        int result = usd * vnd;
        System.out.println(usd + "USD bằng " + result + " VND");
    }
}
