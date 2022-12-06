package ArrJava;

import java.util.Scanner;

public class FindMinArr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, index;
        int[] arr;

        do {
            System.out.print("Nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.print("Độ dài mảng không quá 20!");
            }
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Danh sách mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        index = minValue(arr);
        System.out.print("Số nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                index = i;
            }
        }
        return index;
    }
}
