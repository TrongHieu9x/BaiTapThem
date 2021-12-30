package Human;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/minites/studen.csv";
    public final ArrayList<Student> students = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void StudenManager() {
        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student createStudent() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter point Math: ");
        double math = scanner.nextDouble();
        System.out.println("Enter point Physic: ");
        double physic = scanner.nextDouble();
        System.out.println("Enter point Chemistry: ");
        double chemistry = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, math, physic, chemistry);
        writeFile(students, PATH_NAME);
        System.out.println("Delete student have name = " + name + " successfully");
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public Student updateById (int id) {
        Student student = null;
        for (Student student1 : students) {
            if (student1.getId() == id) {
                student = student1;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            System.out.println("Enter new name: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("Enter new age: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Enter new point Math: ");
            double math = scanner.nextDouble();
            student.setPointMath(math);
            System.out.println("Enter new point Physic: ");
            double physic = scanner.nextDouble();
            student.setPointPhysic(physic);
            System.out.println("Enter new point Chemistry: ");
            double chemistry = scanner.nextDouble();
            student.setPointChemistry(chemistry);
            scanner.nextLine();
            students.set(index, student);
        }
        return student;
    }

    public Student deleteById(int id) {
        Student student = null;
        for (Student student1 : students) {
            if (student1.getId() == id) {
                student = student1;
            }
        }
        if (student != null) {
            students.remove(student);
            writeFile(students, PATH_NAME);
            System.out.println("Delete student have name = " + id + " successfully");
        }
        return student;
    }

    public Student searchById(int id) {
        Student student = null;
        for (Student student1 : students) {
            if (student1.getId() == id) {
                student = student1;
            }
        }
        return student;
    }

    public ArrayList<Student> getStudentsByMaxPoint() {
        ArrayList<Student> studentsMax = new ArrayList<>();
        double avg = students.get(0).getAvgPoint();
        for (Student s : students) {
            if (s.getAvgPoint() > avg) {
                avg = s.getAvgPoint();
            }
        }
        for (Student s : students) {
            if (s.getAvgPoint() == avg) {
                studentsMax.add(s);
            }
        }
        return studentsMax;
    }

    public ArrayList<Student> sortByAvgPointDecrease() {
        students.sort((o1, o2) -> Double.compare(o2.getAvgPoint(), o1.getAvgPoint()));
        return students;
    }

    public ArrayList<Student> sortByPointAscending() {
        students.sort(((o1, o2) -> Double.compare(o1.getAvgPoint(), o2.getAvgPoint())));
        return students;
    }

}
