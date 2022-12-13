package MiniTest;

import java.util.Scanner;

import static MiniTest.StudentManager.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] students = {};
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo danh sách học sinh");
            System.out.println("2. Thêm học sinh vào danh sách");
            System.out.println("3. Tìm học sinh có điểm trung bình cao nhất");
            System.out.println("4. Tìm học sinh có điểm trung bình thấp nhất");
            System.out.println("5. Thêm học sinh mới vào danh sách");
            System.out.println("6. Xoá thông tin của học sinh");
            System.out.println("7. Tìm kiếm học sinh theo tên");
            System.out.println("8. Hiển thị học sinh theo giới tính");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    students = createStudentList();
                    break;
                case 2:
                    createStudent(students, input);
                    break;
                case 3:
                    maxMedium(students);
                    break;
                case 4:
                    minMedium(students);
                    break;
                case 5:
                    students = addStudent(students, input);
                    break;
                case 6:
                    students = deleteByName(students, input);
                    break;
                case 7:
                    searchByName(students, input);
                    break;
                case 8:
                    displayStudentByGender(students, input);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
