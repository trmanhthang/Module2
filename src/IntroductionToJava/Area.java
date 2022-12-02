package IntroductionToJava;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int width;
        int height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        width = scanner.nextInt();

        System.out.println("Nhập chiều rộng: ");
        height = scanner.nextInt();

        int area = width * height;
        System.out.println("Diện tích là: " + area);
    }
}
