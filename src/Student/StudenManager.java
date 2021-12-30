package Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class StudenManager {
    public static final String PATH_NAME = "src/baitapthem/baitap_29_12/student.csv";
    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudenManager() {
        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public boolean checkAgeAndAverage(int age, double average) {
        return (age >= 18 && age <= 60 && !(average < 0) && !(average > 10));
    }

    public String getSexByChoice(int choice) {
        String sex = "";
        switch (choice) {
            case 1:
                sex = "Male";
                break;
            case 2:
                sex = "Female";
                break;
            case 3:
                sex = "Other";
                break;
        }
        return sex;
    }

    public void addStudent() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter choice sex: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Enter your choice: ");
        int sex = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter average: ");
        double average = scanner.nextDouble();
        scanner.nextLine();
        if (checkAgeAndAverage(age, average) && !getSexByChoice(sex).equals("")) {
            students.add(new Student(name, age, getSexByChoice(sex), address, average));
            writeFile(students, PATH_NAME);
            System.out.println("Add student have name = " + name + " successfully!");
        } else {
            System.out.println("Data entry error, please check again!!!");
        }
    }

    public Student editStudent(String name) {
        Student editedStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                editedStudent = student;
            }
        }
        if (editedStudent != null) {
            int index = students.indexOf(editedStudent);
            System.out.println("Enter new name: ");
            editedStudent.setName(scanner.nextLine());
            System.out.println("Enter new age: ");
            editedStudent.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter new sex: ");
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("3. Other");
            System.out.println("Input your choice: ");
            int sex = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter new address: ");
            editedStudent.setAddress(scanner.nextLine());
            System.out.println("Enter new average: ");
            editedStudent.setAverage(scanner.nextDouble());
            scanner.nextLine();
            if (checkAgeAndAverage(editedStudent.getAge(), editedStudent.getAverage()) && !getSexByChoice(sex).equals("")) {
                editedStudent.setSex(getSexByChoice(sex));
                students.set(index, editedStudent);
                writeFile(students, PATH_NAME);
                System.out.println("Data entry error, please check again!!!");
            }
        }
        return editedStudent;
    }

    public Student deleteStudent(String name) {
        Student editedStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                editedStudent = student;
            }
            return editedStudent;
        }
        if (editedStudent != null) {
            students.remove(editedStudent);
            writeFile(students, PATH_NAME);
            System.out.println("Delete student have name = " + name + " successfully");
        }
        return editedStudent;
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("List student is Empty!");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayStudentByAverage() {
        if (students.isEmpty()) {
            System.out.println("List students is Empty!");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayStudentFormat() {
        if (students.isEmpty()) {
            System.out.println("List student is Empty!");
            return;
        }
        for (Student student : students) {
            if (student.getAverage() > 8.0) {
                System.out.println(student.getName() + " - " + student.getAverage() + " - " + "good");
            } else if (student.getAverage() > 6.0) {
                System.out.println(student.getName() + " - " + student.getAverage() + " - " + "Pretty");
            } else if (student.getAverage() > 4.0) {
                System.out.println(student.getName() + " - " + student.getAverage() + " - " + "Normal");
            } else {
                System.out.println(student.getName() + " - " + student.getAverage() + " - " + "Weak");
            }
        }
    }

    public void writeFile(ArrayList<Student> students, String path) {
        try {
            Writer out;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getName() + ","
                        + student.getSex() + "," + student.getAddress() + "," + student.getAverage() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Write file successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path)) ;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2], strings[3], Double.parseDouble(strings[4])));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
}
