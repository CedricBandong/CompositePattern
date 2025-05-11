public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;
    
    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getStudentCount() {
        return 1; 
    }
    
    @Override
    public double getBudget() {
        return -tuitionFee; 
    }
    
    @Override
    public void display() {
        System.out.println(name + ", ID: " + studentId + ", Tuition: $" + String.format("%.2f", tuitionFee));
    }
}
