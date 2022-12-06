package ArrJava;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            arr3[j + arr1.length] = arr2[j];
        }

        System.out.print("Mảng sau khi gộp: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
