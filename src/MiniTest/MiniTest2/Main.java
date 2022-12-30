package MiniTest.MiniTest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Category> categories = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        mainMenu(input, categories, products);

    }

    private static void mainMenu(Scanner input, List<Category> categories, List<Product> products) {
        do {
            System.out.println("MENU CHÍNH: ");
            System.out.println("1. CATEGORY");
            System.out.println("2. PRODUCT");
            System.out.println("0. Thoát menu");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    CategoryManager.menuCategory(categories, input);
                    break;
                case 2:
                    ProductManager.menuProduct(categories, products, input);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
