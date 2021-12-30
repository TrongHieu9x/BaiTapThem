package Human;

public class Student extends Human {
    private double pointMath;
    private double pointPhysic;
    private double pointChemistry;

    public Student(String name, int age, double pointMath, double pointPhysic, double pointChemistry) {
        super(name, age);
        this.pointMath = pointMath;
        this.pointPhysic = pointPhysic;
        this.pointChemistry = pointChemistry;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointPhysic() {
        return pointPhysic;
    }

    public void setPointPhysic(double pointPhysic) {
        this.pointPhysic = pointPhysic;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(double pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    public double getAvgPoint() {
        return (pointMath + pointPhysic + pointChemistry);
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "pointMath=" + pointMath +
                ", pointPhysic=" + pointPhysic +
                ", pointChemistry=" + pointChemistry +
                '}';
    }
}
