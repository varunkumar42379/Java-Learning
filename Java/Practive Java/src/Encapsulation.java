class Encapsulation{
    public static void main(String[] args) {
        Employee e=new Employee(1,"varun","software");
        System.out.println(e);

        e.setEmpName("kumar");
        System.out.println(e.getEmpName());


    }
}
class Employee {
    private long empId;
    private String empName;
    private String empDesignation;


    public Employee(long empId, String empName, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }
}