package Student;

import LapTop.Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class StudenManager {
    private ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudenManager() {
        this.students = new ArrayList<>();
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static Student createStudent() {
        scanner.nextLine();
        System.out.println("Enter name:  ");
        String name = scanner.nextLine();
        System.out.println("Enter sex: ");
        String sex = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter điểm trung bình: ");
        double averagePoint = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, sex, address, averagePoint);
    }

    public void updateByName(String name) {
        Student studentUpdate = null;
        for (Student student : students) {
            if (Student.getName() == name) {
                studentUpdate = student;
            }
        }
        if (studentUpdate != null) {
            System.out.println("Enter new name:  ");
            studentUpdate.setName(scanner.nextLine());
            System.out.println("Enter new sex: ");
            studentUpdate.setSex(scanner.nextLine());
            System.out.println("Enter new address: ");
            studentUpdate.setAddress(scanner.nextLine());
            System.out.println("Enter new điểm trung bình: ");
            studentUpdate.setAveragePoint(scanner.nextDouble());

            scanner.nextLine();
        }
    }

    public Student deleteByName(String name) {
        Student student = null;
        for (Student student1 : students) {
            if (Student.getName() == name) {
                student = student1;
            }
        }
        students.remove(student);
        return student;
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
