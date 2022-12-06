package ArrJava;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[];
        int size;
        do {
            System.out.println("Nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Độ dài mảng không quá 20!");
            }
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử" + (i + 1) +": ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Danh sách mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int max = arr[0];
        int index = 1;
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                index = j;
            } else {
                max = arr[0];
            }
        }
        System.out.print("Số lớn nhất là: " + max +" ở vị trí " + index);
    }
}
