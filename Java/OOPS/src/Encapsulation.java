public class Encapsulation{
    public static void main(String[] args) {
        Employee emp=new Employee(2,"Vamshi","Delivery");

        System.out.println(emp.getEmployeeName());

        emp.setEmployeeName("Varun");

        System.out.println(emp.getEmployeeName());
    }
}

class Employee{
    private long employeeId;
    private String employeeName;
    private String empDesignation;

    public Employee(long employeeId, String employeeName, String empDesignation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.empDesignation = empDesignation;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }
}