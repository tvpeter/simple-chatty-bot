public class Employee extends Person {

    private String title;
    private String employeeId;

    public String getTitle() {
        return title;
    }

    public Employee(){
        super("john");
        System.out.println("Employee constructor");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
