/*
 * ============================================================
 * DAY 3 — Student.java  (extends Member)
 * ============================================================
 */

public class Student extends Members {

    private String grade;
    private String rollNumber;

    public Student(int id, String name, String email, String grade, String rollNumber) {
        super(id, name, email, "STUDENT");
        this.grade      = grade;
        this.rollNumber = rollNumber;
    }

    public String getGrade()      { return this.grade; }
    public String getRollNumber() { return this.rollNumber; }
    public void setGrade(String grade)           { this.grade = grade; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade        : " + this.grade);
        System.out.println("Roll Number  : " + this.rollNumber);
        System.out.println("=============================");
    }
}