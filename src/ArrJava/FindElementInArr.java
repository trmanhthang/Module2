package ArrJava;

import java.util.Scanner;

public class FindElementInArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String student[] = {"Liên", "Duy", "Hoàng", "Dũng", "Mạnh", "Linh", "Đức Anh", "Vũ", "Sơn", "Ngọc", "Cường", "Thắng"};
        System.out.println("Nhập tên để tìm kiếm: ");
        String name = input.nextLine();

        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println(name + " nằm ở vị trí " + i);
                break;
            } else {
                System.out.println("Không tìm thấy " + name);
                break;
            }
        }
    }
}
