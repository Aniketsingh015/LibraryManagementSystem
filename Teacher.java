/*
 * ============================================================
 * DAY 3 — Teacher.java  (extends Member)
 * ============================================================
 */

public class Teacher extends Members {

    private String department;
    private String employeeId;

    public Teacher(int id, String name, String email, String department, String employeeId) {
        super(id, name, email, "TEACHER");
        this.department = department;
        this.employeeId = employeeId;
    }

    public String getDepartment() { return this.department; }
    public String getEmployeeId() { return this.employeeId; }
    public void setDepartment(String department) { this.department = department; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department   : " + this.department);
        System.out.println("Employee ID  : " + this.employeeId);
        System.out.println("=============================");
    }
}