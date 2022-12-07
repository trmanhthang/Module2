package ArrJava;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int[][] arr = {{10, 9, 7}, {1, 3, 4}, {8, 0, 2}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("Tổng giá tri của đường chéo chính là: " + sum);
    }
}
