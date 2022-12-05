package LoopInJava;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();

        boolean check = false;
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            int i = 2;
            check = true;
            while (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        if (check) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
