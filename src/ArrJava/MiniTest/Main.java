package ArrJava.MiniTest;

import ArrJava.StaticMethod.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int classifyProduct = 0;
        System.out.println("Nhập số lượng sản phẩm bạn muốn lập:");
        classifyProduct = Integer.parseInt(input.nextLine());

        Product[] productList = new Product[classifyProduct];

        int i = 0;
        while (i < productList.length) {
            System.out.println("Nhập sản phẩm " + (i + 1) + " :");
            System.out.println("Nhập tên sản phẩm: name =  ");
            String name = input.nextLine();
            System.out.println("Nhập số loại sản phẩm: classify = ");
            String classify = input.nextLine();
            System.out.print("Nhập số lượng sản phẩm: price = ");
            int price = Integer.parseInt(input.nextLine());
            System.out.print("Nhập loại tiền: cent = ");
            String cent = input.nextLine();
            Product product = new Product(name, classify, price, cent);
            productList[i] = product;
            i++;
        }
        for (int j = 0; j < productList.length; j++) {
            System.out.println(productList[j]);
        }
    }
}
