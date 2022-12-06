package ArrJava;

import java.util.Scanner;

public class SwapInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int arr[];
        do {
            System.out.println("Nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Độ dài mảng ko quá 20");
            }
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Phần tử trong mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.print("Mảng khi sắp xếp: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

    }
}
