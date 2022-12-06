package ArrJava;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int size;

        do {
            System.out.println("Nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Độ dài mảng quá 20!");
            }
        }while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập phần tử " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Danh sách mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.print("Nhập số cần xoá: ");
        int number = input.nextInt();

        for (int c = i = 0; i < arr.length; i++) {
            if (number != arr[i]) {
                arr[c] = arr[i];
                c++;
            }
        }
        System.out.print("Mảng sau khi xoá phần tử " + number + ": ");
        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c] + "\t");
        }
    }
}
