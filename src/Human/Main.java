package Human;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Thêm 1 sinh viên: ");
            System.out.println("2. Sửa 1 sinh viên: ");
            System.out.println("3. Xóa 1 sinh viên: ");
            System.out.println("4. Tìm 1 sinh viên: ");
            System.out.println("5. Hiển thị theo điểm trung bình tăng dần: ");
            System.out.println("6. Hiển thị theo điểm trung bình giảm dần");
            System.out.println("7. Tìm sinh viên có điểm cao nhất: ");
            System.out.println("8. Ghi file");
            System.out.println("9. read file");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = studentManager.createStudent();
                    if (studentManager.addStudent(student)) {
                        System.out.println("Thêm ok");
                    } else {
                        System.out.println("Thêm no ok");
                    }
                    break;
                case 2:
                    System.out.println("Nhập id muốn update: ");
                    int editId = scanner.nextInt();
                    Student studentEdit = studentManager.updateById(editId);
                    if (studentEdit != null) {
                        System.out.println(studentEdit);
                    }
                    break;
                case 3:
                    System.out.println("Nhập id muốn delete: ");
                    int deleteId = scanner.nextInt();
                    Student studentDelete = studentManager.deleteById(deleteId);
                    if (studentDelete != null) {
                        System.out.println(studentDelete);
                    }
                    break;
                case 4:
                    System.out.println("Nhập id muốn tim: ");
                    int searchId = scanner.nextInt();
                    Student studentSearch = studentManager.searchById(searchId);
                    if (studentSearch != null) {
                        System.out.println(studentSearch);
                    }
                    break;
                case 5:
                    ArrayList<Student> students = studentManager.sortByPointAscending();
                    students.forEach(System.out::println);
                    break;
                case 6:
                    ArrayList<Student> students1 = studentManager.sortByAvgPointDecrease();
                    students1.forEach(System.out::println);
                    break;
                case 7:
                    ArrayList<Student> studentMax = studentManager.getStudentsByMaxPoint();
                    studentMax.forEach(System.out::println);
                    break;
            }
        }while (choice != 0);
    }
}
