package ArrJava;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int index, number;
        System.out.print("Damh sách mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("Nhập vị trí bạn muốn thêm: ");
        index = input.nextInt();

        System.out.print("Số bạn muốn thêm vào mảng: ");
        number = input.nextInt();

        if (index <= -1 || index >= arr.length - 1) {
            System.out.print("Không thêm được " + number + " vào mảng!");
        } else {
            for (int j = 0; j < arr.length; j++) {
                if (index == j) {
                    arr[j] = number;
                }
            }

            System.out.println("Mảng mới khi thêm " + number + " vào vị trí " + index + ":");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
