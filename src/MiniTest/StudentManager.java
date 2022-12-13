package MiniTest;

import ArrJava.MiniTest.Product;

import java.util.Scanner;

public class StudentManager {
    public static  Student[] createStudentList() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh muốn tạo: ");
        int length = Integer.parseInt(input.nextLine());
        return new Student[length];
    }

    public static void createStudent(Student[] students, Scanner input) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Tạo thông tin học sinh thứ " + (i + 1));
            System.out.println("Nhập tên học sinh: ");
            String name = input.nextLine();
            System.out.println("Nhập tuổi của học sinh: ");
            int age = Integer.parseInt(input.nextLine());
            System.out.println("Nhập giới tính: ");
            String gender = input.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String address = input.nextLine();
            System.out.println("Nhập điểm trung bình của học sinh: ");
            double medium = Integer.parseInt(input.nextLine());

            students[i] = new Student(name, age, gender, address, medium);
        }
    }

    public static void maxMedium(Student[] students) {
        double max= students[0].getMedium();
        Student student = students[0];
        for (int i = 1; i < students.length; i++) {
            if (max < students[i].getMedium()) {
                student = students[i];
            }
        }
        System.out.println("Học sinh có điểm cao nhất là: " + student);
    }

    public static void minMedium(Student[] students) {
        double min= students[0].getMedium();
        Student student = students[0];
        for (int i = 1; i < students.length; i++) {
            if (min > students[i].getMedium()) {
                student = students[i];
            }
        }
        System.out.println("Học sinh có điểm thấp nhất là: " + student);
    }

    public static Student[] addStudent(Student[] students, Scanner input) {
        Student[] studentsAdd = new Student[students.length + 1];
        System.out.println("Nhập thông tin học sinh muốn thêm: ");
        System.out.println("Nhập tên học sinh: ");
        String name = input.nextLine();
        System.out.println("Nhập tuổi học sinh: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giới tính học sinh: ");
        String gender = input.nextLine();
        System.out.println("Nhập địa chỉ học sinh: ");
        String address = input.nextLine();
        System.out.println("Nhập điểm trung bình của học sinh: ");
        double medium = Integer.parseInt(input.nextLine());
        for (int i = 0; i < students.length; i++) {
            studentsAdd[i] = students[i];
        }

        for (int j = 0; j < studentsAdd.length; j++) {
            studentsAdd[studentsAdd.length - 1] = new Student(name, age, gender, address, medium);
            System.out.println(studentsAdd[j]);
        }
        return studentsAdd;
    }

    public static Student[] deleteByName(Student[] students, Scanner input) {
        System.out.println("Nhập tên học sinh bạn muốn xoá: ");
        String name = input.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                students[i] = null;
            }

            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
        return students;
    }

    public static void searchByName(Student[] students, Scanner input) {
        System.out.print("Nhập tên học sinh cần tìm: ");
        String nameSearch = input.nextLine();
        Student student = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(nameSearch)) {
                    student = students[i];
                }
            }
        }
        System.out.println(student);
    }

    public static void displayStudentByGender(Student[] students, Scanner input) {
        System.out.println("1. Hiển thị học sinh giới tính nam");
        System.out.println("2. Hiển thị học sinh giới tính nữ");
        System.out.println("Nhập lựa chọn của bạn: ");
        int choice = Integer.parseInt(input.nextLine());

        switch (choice) {
            case 1:
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getGender().equalsIgnoreCase("nam")) {
                        System.out.println(students[i]);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getGender().equalsIgnoreCase("nữ")) {
                        System.out.println(students[i]);
                    }
                }
        }
    }
}
