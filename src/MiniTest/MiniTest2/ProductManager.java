package MiniTest.MiniTest2;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static int id = 0;
    public static void menuProduct(List<Category> categories, List<Product> products, Scanner input) {
        int choice;
        do {
            System.out.println("MENU PRODUCT: ");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xoá sản phẩm theo id");
            System.out.println("3. Hiển thị danh sách sản phẩm");
            System.out.println("4. Hiển thị sản phẩm giá cao nhất, thấp nhất");
            System.out.println("5. Hiển thị sản phẩm có số lượng cao nhất, thấp nhất");
            System.out.println("6. Hiển thị sản phẩm theo loại sản phẩm");
            System.out.println("7. Sửa thông tin sản phẩm theo id");
            System.out.println("8. Tìm kiếm sản phẩm");
            System.out.println("9. Tìm kiếm sản phẩm theo khoảng giá");
            System.out.println("0. Trở về menu chính");
            System.out.println("[Nhập lựa chọn của bạn]:");

            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    addProduct(products, categories, input);
                    break;
                case 2:
                    deleteProduct(products, input);
                    break;
                case 3:
                    displayProduct(products);
                    break;
                case 4:
                    displayMaxPrice(products);
                    displayMinPrice(products);
                    break;
                case 5:
                    displayMaxQuantity(products);
                    displayMinQuantity(products);
                    break;
                case 6:
                    displayByCategory(products, input);
                    break;
                case 7:
                    editProductById(categories, products, input);
                    break;
                case 8:
                    searchProductByName(products, input);
                    break;
                case 9:
                    searchProductByPrice(products, input);
                    break;
            }
        } while (choice != 0);
    }

    public static Product createProduct(List<Category> categories, Scanner input) {
        System.out.println("Điền thông tin sản phẩm: ");
        System.out.println("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.println("Chọn loại hàng của sản phẩm: ");
        CategoryManager.displayCategory(categories);
        Category category = selectCategory(categories, input);
        id++;

        return new Product(id ,name, price, quantity, category);
    }

    public static void addProduct(List<Product> products, List<Category> categories, Scanner input) {
        products.add(createProduct(categories, input));
        System.out.println("Thêm sản phẩm thành công!");
    }

//    private static Category choiceCategory(List<Category> categories ,Scanner input) {
//        Category category = null;
//        System.out.println("Chọn loại mặt hàng: ");
//        int idCategory = Integer.parseInt(input.nextLine());
//        if (idCategory == 0) {
//            CategoryManager.creatCategory(input);
//            CategoryManager.addCategory(categories, input);
//        } else {
//            category = CategoryManager.getById(categories, idCategory);
//        }
//        if (category != null) {
//            return category;
//        } else {
//            return choiceCategory(categories, input);
//        }
//    }
    public static Category selectCategory(List<Category> categories, Scanner input) {
        System.out.println("Nhập lựa chọn của bạn: ");
        int choice = Integer.parseInt(input.nextLine());
        Category nameCategory = null;
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == (choice)) {
                nameCategory = categories.get(i);
            }
        }
        return nameCategory;
    }

    public static void deleteProduct(List<Product> products, Scanner input) {
        if (products.size() != 0) {
            System.out.println("Nhập id sản phẩm bạn muốn xoá: ");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).equals(id)) {
                    products.remove(i);
                }
            }
        } else {
            System.out.println("Chưa có sản phẩm nào trong danh sách!");
        }
    }

    public static void displayProduct(List<Product> products) {
        if (products.size() != 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i));
            }
        } else {
            System.out.println("Chưa có sản phẩm nào trong danh sách!");
        }
    }

    public static void displayMaxPrice(List<Product> products) {
        if (products.size() != 0) {
            int maxPrice = products.get(0).getPrice();
            for (int i = 1; i < products.size(); i++) {
                if (maxPrice < products.get(i).getPrice()) {
                    maxPrice = products.get(i).getPrice();
                }
            }
            System.out.println("Sản phẩm có giá cao nhất: " + maxPrice);
        } else {
            System.out.println("Không có sản phẩm nào trong danh sách!");
        }
    }

    public static void displayMinPrice(List<Product> products) {
        if (products.size() != 0) {
            int minPrice = products.get(0).getPrice();
            for (int i = 0; i < products.size(); i++) {
                if (minPrice > products.get(i).getPrice()) {
                    minPrice = products.get(i).getPrice();
                }
            }
            System.out.println("Sản phẩm có giá thấp nhất: " + minPrice);
        } else {
            System.out.println("Không có sản phẩm nầo trong danh sách!");
        }
    }

    public static void displayMaxQuantity(List<Product> products) {
        if (products.size() != 0) {
            int maxQuantity = products.get(0).getQuantity();
            for (int i = 1; i < products.size(); i++) {
                if (maxQuantity < products.get(i).getQuantity()) {
                    maxQuantity = products.get(i).getQuantity();
                }
            }
            System.out.println("Sản phẩm có số lượng nhiều nhất: " + maxQuantity);
        } else {
            System.out.println("Không có sản phẩm nào trong danh sách!");
        }
    }

    public static void displayMinQuantity(List<Product> products) {
        if (products.size() != 0) {
            int minQuantity = products.get(0).getQuantity();
            for (int i = 1; i < products.size(); i++) {
                if (minQuantity > products.get(i).getQuantity()) {
                    minQuantity = products.get(i).getQuantity();
                }
            }
            System.out.println("Sản phẩm có số lượng ít nhất: " + minQuantity);
        } else {
            System.out.println("Không có sản phẩm nào trong danh sách");
        }
    }

    public static void displayByCategory(List<Product> products, Scanner input) {
        if (products.size() != 0) {
            System.out.println("Nhập tên loại hàng: ");
            String categoryDisplay = input.nextLine();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getCategory().getName().equals(categoryDisplay)) {
                    System.out.println(products.get(i));
                }
            }
        } else {
            System.out.println("Không có sản phẩm để hiển thị!");
        }
    }

    public static void editProductById(List<Category> categories, List<Product> products, Scanner input) {
        if (products.size() != 0) {
            System.out.println("Nhập id sản phẩm bạn muốn sửa: ");
            int idCheck = Integer.parseInt(input.nextLine());
            for (int i = 0; i < products.size(); i++) {
                if (idCheck == products.get(i).getId()) {
                    System.out.println("Sửa thông tin sản phẩm: ");
                    System.out.println("Sửa tên sản phẩm: ");
                    String name = input.nextLine();
                    if (name == null) {
                        products.get(i).setName(products.get(i).getName());
                    } else {
                        products.get(i).setName(name);
                    }

                    System.out.println("Sửa giá sản phẩm: ");
                    String price = input.nextLine();
                    if (price == null) {
                        products.get(i).setPrice(products.get(i).getPrice());
                    } else {
                        products.get(i).setPrice(Integer.parseInt(price));
                    }

                    System.out.println("Sửa số lượng sản phẩm: ");
                    String quantity = input.nextLine();
                    if (quantity == null) {
                        products.get(i).setQuantity(products.get(i).getQuantity());
                    } else {
                        products.get(i).setQuantity(Integer.parseInt(quantity));
                    }

                    if (categories.size() != 0) {
                        System.out.println("Sửa loại hàng của sản phẩm: ");
                        CategoryManager.displayCategory(categories);
                        Category category = selectCategory(categories, input);
                        products.get(i).setCategory(category);
                    } else {
                        products.get(i).setCategory(null);
                    }
                }
            }
            System.out.println("Sửa sản phẩm thành công!");
        } else {
            System.out.println("Không có sản phẩm trong danh sách!");
        }
    }

    public static void searchProductByName(List<Product> products, Scanner input) {
        if (products.size() != 0) {
            System.out.println("Nhập tên sản phẩm muốn tìm: ");
            String nameSearch = input.nextLine();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                    System.out.println(products.get(i));
                }
            }
        } else {
            System.out.println("Không có sản phẩm trong danh sách!");
        }
    }

    public static void searchProductByPrice(List<Product> products, Scanner input) {
        int startPrice, endPrice;
        if (products.size() != 0) {
            do {
                System.out.println("Nhập giá từ: ");
                startPrice = Integer.parseInt(input.nextLine());
                System.out.println("đến: ");
                endPrice = Integer.parseInt(input.nextLine());

                for (int i = 0; i < products.size(); i++) {
                    int product = products.get(i).getPrice();
                    if (product >= startPrice && product <= endPrice) {
                        System.out.println(products.get(i));
                    }
                }
            } while (startPrice > endPrice || startPrice < 0);
        } else {
            System.out.println("Không có sản phẩm trong danh sách!");
        }
    }
}


