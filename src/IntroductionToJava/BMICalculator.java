package IntroductionToJava;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiểm tra chỉ số BMI");
        double weight;
        System.out.println("Nhập cân nặng của bạn: ");
        weight = scanner.nextDouble();

        double height;
        System.out.println("Nhập chiều cao của bạn: ");
        height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("Bạn đang thiếu cân!");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Bạn cân đối!");
        } else  if (bmi >= 25 && bmi < 30) {
            System.out.println("Bạn thừa cân!");
        } else if (bmi >= 30) {
            System.out.println("Bạn béo phì!");
        }

    }
}
