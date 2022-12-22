package Exception.ArrayIndexOutOfBoundsException;

import org.xml.sax.helpers.ParserAdapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kì: ");
        int x = input.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
