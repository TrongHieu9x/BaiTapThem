package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudenManager studenManager = new StudenManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Thêm 1 sinh viên: ");
            System.out.println("2. Sửa 1 sinh viên");
            System.out.println("3. Xóa 1 sinh viên");
            System.out.println("4. Hiển thị tất cả sinh viên");
            System.out.println("5. Hiển thị tất cả sinh viên có điểm trung bình trên 7.5");
            System.out.println("6. Hiển thị học sinh ở định dạng");
            System.out.println("7. ghi file");
            System.out.println("8. đọc file");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studenManager.addStudent();
                    break;

                case 2:
                    System.out.println("Enter name muốn edit: ");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    System.out.println(studenManager.editStudent(editName));
                    break;

                case 3:
                    System.out.println("Enter name muốn delete: ");
                    scanner.nextLine();
                    String deleteName = scanner.nextLine();
                    System.out.println(studenManager.deleteStudent(deleteName));
                    break;
                case 4:
                    System.out.println("All student: ");
                    studenManager.displayAll();
                    break;
                case 5:
                    System.out.println("All student By Average: ");
                    studenManager.displayStudentByAverage();
                    break;
                case 6:
                    System.out.println("All student in format: ");
                    studenManager.displayStudentFormat();
                    break;
                case 7:
                    studenManager.writeFile(studenManager.getStudents(), StudenManager.PATH_NAME);
                    break;
                case 8:
                    ArrayList<Student> students = studenManager.readFile(StudenManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}
