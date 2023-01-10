package ThiMD2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static MiniTest.StudentManager.*;
import static MiniTest.StudentManager.displayStudentByGender;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        ProductManager productManager = new ProductManager();

        do {
            boolean flag = true;
            int choice = 0;
            do {
                try {
                    System.out.println("MENU");
                    System.out.println("1. Xem danh sách");
                    System.out.println("2. Thêm mới");
                    System.out.println("3. Cập nhật");
                    System.out.println("4. Xoá");
                    System.out.println("5. Sắp xếp tăng dần");
                    System.out.println("6. Tìm sản phẩm có giá đắt nhất");
                    System.out.println("7. Ghi vào file");
                    System.out.println("8. Đọc từ file");
                    System.out.println("0. Thoát chương trình");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    choice = Integer.parseInt(input.nextLine());
                    flag = false;
                } catch (NumberFormatException e) {
                    System.out.println("Mời nhập lại!");
                }
            } while (flag);
            switch (choice) {
                case 1:
                    productManager.displayProduct(productList);
                    break;
                case 2:
                    productManager.addProduct(productList, input);
                    break;
                case 3:
                    productManager.editProduct(productList, input);
                    break;
                case 4:
                    productManager.delProduct(productList, input);
                    break;
                case 5:
                    productManager.check(productList);
                    break;
                case 6:
                    productManager.searchProductMaxPrice(productList);
                    break;
                case 7:
                    productManager.writeToFile(productList);
                    break;
                case 8:
                    productManager.displayFile();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
