public class Employee {
  //Step 1: Declare employee attributes
    int empId;
    String empName;
    double salary;

    //Step 2: Create constructor to initialize object values
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    //Step: Method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID:" + empId);
        System.out.println("Employee Name:" + empName);
        System.out.println("Salary:" + salary);
    }

    public static void main(String[] args) {
         //Step 4: Create object and pass values directly
        Employee emp1 = new Employee( 201,  "Gunnu",  450000);

        //Step 5: Display employee details
        emp1.displayEmployee();

    }
}
