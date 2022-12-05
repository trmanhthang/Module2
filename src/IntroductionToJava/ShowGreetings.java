package IntroductionToJava;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tên của bạn: ");
        String name = scanner.nextLine();

        System.out.println("Xin chào " + name);
    }
}
