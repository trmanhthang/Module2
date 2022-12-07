package ArrJava;

import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{10, 9, 7}, {1, 3, 4}, {8, 0, 2}};
        int index;
        int sum = 0;
        System.out.print("Chọn cột bạn muốn tính tổng: ");
        index = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (index == j) {
                    sum += arr[i][index];
                }
            }
        }
        System.out.print("Tổng giá trị cột " + index + " là: " + sum);
    }
}
