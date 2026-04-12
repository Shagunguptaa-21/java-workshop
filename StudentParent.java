// Parent class
class StudentParent {
    // Parent class properties
    int rollNo = 101;
    String name = "gunnu";

    // Parent class method
    void showStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    // Main method to run the program
    public static void main(String[] args) {
        CollageStudent student = new CollageStudent();
        student.showStudentDetails();
        student.showCollageStudentDetails();
    }
}

// Child class inherits parent class
class CollageStudent extends StudentParent {
    // Child class property
    String collageName = "ABC college";

    // Child class method
    void showCollageStudentDetails() {
        System.out.println("College Name: " + collageName);
    }
}
