package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudenManager studenManager = new StudenManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Thêm 1 sinh viên: ");
            System.out.println("2. Xóa 1 sinh viên");
            System.out.println("3. Sửa 1 sinh viên");
            System.out.println("4. Hiển thị tất cả sinh viên");
            System.out.println("5. Hiển thị tất cả sinh viên có điểm trung bình trên 7.5");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Student student1 = StudenManager.createStudent();
                    StudenManager.addStudent(student1);
                    break;
            }
        }
    }
}
