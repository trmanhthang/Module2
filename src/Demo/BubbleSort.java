package Demo;

public class BubbleSort {
    static void bubbleSort(int[] array) {
        boolean check = true;
        for (int i = 0; i < array.length - 1 && check; i++) {
            for (int j = array.length - 1; j > i; j--) {
                check = false;
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    check = true;
                }
            }
        }
        System.out.println("Sắp xếp nổi bọt: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
