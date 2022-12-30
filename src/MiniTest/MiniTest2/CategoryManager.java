package MiniTest.MiniTest2;

import java.util.List;
import java.util.Scanner;

public class CategoryManager {
    static int id = 0;
    public static void menuCategory(List<Category> categories, Scanner input) {
        int choice;
        try {
            do {
                System.out.println("MENU CATEGORY: ");
                System.out.println("1. Thêm loại mặt hàng");
                System.out.println("2. Xoá một loại sản phẩm theo id");
                System.out.println("3. Hiển thị danh sách loại sản phẩm hiện có");
                System.out.println("4. Sửa thông tin loại sản phẩm theo id");
                System.out.println("0. Quay lại menu chính");
                System.out.println("[Nhập lựa chọn của bạn]: ");
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {
                    case 1:
                        addCategory(categories, input);
                        break;
                    case 2:
                        deleteCategory(categories, input);
                        break;
                    case 3:
                        displayCategory(categories);
                        break;
                    case 4:
                        editCategory(categories, input);
                        break;
                }
            } while (choice != 0);
        } catch (NumberFormatException e) {
            e.getStackTrace();
        }
    }

    public static Category creatCategory(Scanner input) {
        System.out.println("Nhập tên loại hàng:");
        String name = input.nextLine();
        id++;

        return new Category(id, name);
    }

    public static void addCategory(List<Category> categories, Scanner input) {
        categories.add(creatCategory(input));
        System.out.println("Thêm loại hàng thành công!");
    }

    public static void deleteCategory(List<Category> categories , Scanner input) {
        if (categories.size() != 0) {
            System.out.println("Nhập id loại hàng bạn muốn xoá: ");
            int idCheck = Integer.parseInt(input.nextLine());
            for (int i = 0; i < categories.size(); i++) {
                if (idCheck == categories.get(i).getId()) {
                    categories.remove(categories.get(i));
                    System.out.println("Đã xoá thành công!" );
                    break;
                }
            }
        } else {
            System.out.println("Chưa có loại hàng nào trong danh sách!");
        }
    }

    public static void displayCategory(List<Category> categories) {
        if (categories.size() == 0) {
            System.out.println("Chưa có loại sản phẩm nào trong danh sách!");
        } else {
            System.out.println("Danh sách sản phẩm gồm có: ");
            for (int i = 0; i < categories.size(); i++) {
                System.out.println(categories.get(i).getId() + ". " + categories.get(i).getName());
            }
        }
    }

    public static void editCategory(List<Category> categories, Scanner input) {
        if (categories.size() != 0) {
            System.out.println("Nhập id loại hàng bạn muốn sửa: ");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < categories.size(); i++) {
                if (id == categories.get(i).getId()) {
                    System.out.println("Sửa thông tin loại hàng: ");
                    System.out.println("Sửa tên loại hàng: ");
                    String name = input.nextLine();
                    if (name == null) {
                        categories.get(i).setName(categories.get(i).getName());
                    } else {
                        categories.get(i).setName(name);
                    }
                    System.out.println("Đã sửa thành công!");
                }
            }
        } else {
            System.out.println("Chưa có loại hàng nào trong danh sách!");
        }
    }
}
