package ArrJava;

public class FindMax2 {
    public static void main(String[] args) {
        int[][] arr = {{5, 1, 4}, {9, 2, 3}, {10, 6, 8}};
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Số lớn nhất trong mảng là: " + max);
    }
}
