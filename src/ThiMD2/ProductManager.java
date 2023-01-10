package ThiMD2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    //    Xem danh sách
    public void displayProduct(List<Product> productList) {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    //    Tạo sản phẩm
    public void addProduct(List<Product> productList, Scanner input) {
        boolean flag = true;
        int id = 0;
        String name = null;
        int price = 0;
        int quantity = 0;
        String desc = null;
        do {
            try {
                System.out.println("Tạo sản phẩm: ");
                System.out.println("Nhập mã sản phẩm: ");
                id = Integer.parseInt(input.nextLine());
                System.out.println("Nhập tên sản phẩm: ");
                name = input.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                price = Integer.parseInt(input.nextLine());
                System.out.println("Nhập số lượng sản phẩm: ");
                quantity = Integer.parseInt(input.nextLine());
                System.out.println("Nhập mô tả sản phẩm: ");
                desc = input.nextLine();
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Mời nhập lại!");
            }
        } while (flag);
        Product product = new Product(id, name, price, quantity, desc);
        productList.add(product);
        System.out.println("Thêm sản phẩm thành công!");
    }

    //    kiểm tra sản phẩm
    public Product checkProduct(int idCheck, List<Product> productList) {
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idCheck) {
                product = productList.get(i);
            }
        }
        return product;
    }

    //    Sửa sản phẩm
    public void editProduct(List<Product> productList, Scanner input) {
        System.out.println("Nhập max sản phẩm cần tìm: ");
        int idCheck = Integer.parseInt(input.nextLine());
        Product product = checkProduct(idCheck, productList);
        boolean flag = true;
        if (product != null) {
            do {
                try {
                    System.out.println("Sửa mã sản phẩm: ");
                    int id = Integer.parseInt(input.nextLine());
                    product.setId(id);
                    System.out.println("Sửa tên sản phẩm: ");
                    String name = input.nextLine();
                    product.setName(name);
                    System.out.println("Sửa giá sản phẩm: ");
                    int price = Integer.parseInt(input.nextLine());
                    product.setPrice(price);
                    System.out.println("Sửa số lượng sản phẩm: ");
                    int quantity = Integer.parseInt(input.nextLine());
                    product.setQuantity(quantity);
                    System.out.println("Sửa mô tả sản phẩm: ");
                    String desc = input.nextLine();
                    product.setDesc(desc);
                    flag = false;
                } catch (NumberFormatException e) {
                    System.out.println("Mời nhập lại");
                }
            } while (flag);
            System.out.println("Sửa thành công!");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    //    Xoá sản phẩm
    public void delProduct(List<Product> productList, Scanner input) {
        System.out.println("Nhập mã sản phẩm cần xoá: ");
        int idCheck = Integer.parseInt(input.nextLine());
        Product product = checkProduct(idCheck, productList);

        if (product != null) {
            System.out.println("Nhập Y để xác nhận xoá!");
            String check = input.nextLine();
            if (check.toUpperCase().equals("Y")) {
                productList.remove(product);
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm! ");
        }
    }

    public void check(List<Product> productList) {
        if (!productList.isEmpty()) {
            displayByPriceUp(productList);
        } else {
            System.out.println("Danh sách trống");
        }
    }
    public void displayByPriceUp(List<Product> productList) {
        System.out.println("List product by up price: ");
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() > o2.getPrice() ? 1 : -1;
            }
        });
        displayProduct(productList);
    }

    public void searchProductMaxPrice(List<Product> productList) {
        if (!productList.isEmpty()) {
            int maxPrice = productList.get(0).getPrice();
            Product product = productList.get(0);
            for (int i = 1; i < productList.size(); i++) {
                if (maxPrice < productList.get(i).getPrice()) {
                    product = productList.get(i);
                }
            }
            System.out.println(product);
        } else {
            System.out.println("Danh sách trống!");
        }
    }

    public void writeToFile(List<Product> productList) {
        try {
            File file = new File("D:\\CG Java\\Module2\\src\\ThiMD2\\File");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter output = new FileWriter(file);

            for (int i = 0; i < productList.size(); i++) {
                output.write(String.valueOf(productList.get(i)));
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readToFile(String nameFile) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream input = new FileInputStream(nameFile);
            if (input.available() > 0) {
                ObjectInputStream inputStream = new ObjectInputStream(input);
                productList = (List<Product>) inputStream.readObject();
                inputStream.close();
                input.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public void displayFile() {
        List<Product> productList = (ArrayList<Product>) readToFile("D:\\CG Java\\Module2\\src\\ThiMD2\\file");
        System.out.println("-----------------------------");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Mã sản phẩm: " + productList.get(i).getId());
            System.out.println("Tên sản phẩm: " + productList.get(i).getName());
            System.out.println("Số lượng bạn mua: " + productList.get(i).getQuantity());
            System.out.println("Giá: " + productList.get(i).getPrice());
            System.out.println("Mô tả sản phẩm: " + productList.get(i).getDesc());
            System.out.println();
        }
        System.out.println("------------------------------");
    }

}
