public class EmployeeThisDemo {

    //Step 1: Instance variables
    int empId;
    String empName;

    //Step 2: Constructor with same variable names as instance variables
    EmployeeThisDemo(int empId, String empName) {

        //Step 3: Use 'this' to refer to current object variables
        this.empId = empId;
        this.empName = empName;
    }

    //Step 4: Display method
    void display() {
        System.out.println("Employee ID:" + empId);
        System.out.println("Employee Name:" + empName);
    }

    public static void main(String[] args) {
        
        //Step 5: Create object
        EmployeeThisDemo emp1 = new EmployeeThisDemo(301, "Gunnu");

        //Step 6: Display values
        emp1.display();
    }
    
}
