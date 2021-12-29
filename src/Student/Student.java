package Student;

public class Student extends Human {
    private double averagePoint;


    public Student(String name, String sex, String address, double averagePoint) {
        super(name, sex, address);
        this.averagePoint = averagePoint;
    }

    public Student() {
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "averagePoint=" + averagePoint +
                '}';
    }
}
