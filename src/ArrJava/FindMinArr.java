package ArrJava;

public class FindMinArr {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 7, 10};
        int index = minValue(arr);
        System.out.println("Số nhỏ nhất là: " + arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
