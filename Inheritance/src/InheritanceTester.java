public class InheritanceTester {

    public static void main(String[] args) {
        //chain of inherited classes -Person - Woman - Mother
        Mother mom = new Mother();
        mom.setName("Comfort");

        System.out.println(mom.getName() + " is a " + mom.getGender());

        Employee employee = new Employee();

        employee.setName("John DOE");
        employee.setEmployeeId("DJI323");
        employee.setTitle("Mr.");
        employee.setGender("Male");

        int empAge = employee.getAge();
        String empNme = employee.getName();
        String empId = employee.getEmployeeId();
        String empGender = employee.getGender();

//        System.out.println(empGender);
    }
}
