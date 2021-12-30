package Student;

public class Student extends Human {
    private double average;


    public Student(String name, int age, String sex, String address, double average) {
        super(name, age, sex, address);
        this.average = average;
    }

    public Student() {
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "average=" + average +
                '}';
    }
}
