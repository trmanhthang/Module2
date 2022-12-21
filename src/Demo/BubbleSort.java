package Demo;

public class BubbleSort {
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Sắp xếp nổi bọt: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
