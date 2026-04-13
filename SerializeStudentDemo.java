import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

//Step 1: Student class must implement Serializable 
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeStudentDemo {
    public static void main(String[] args) {
        try{
            // Step 2: Create Student object
        Student s1 = new Student(1, "Gunnu");

        // Step 3: Create FileOutputStream
        FileOutputStream fos = new FileOutputStream("student.ser");

        //Step 4: wrap with ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Stwep 5: Write object
        oos.writeObject(s1);

        // Step 6: Close streams
        oos.close();
        fos.close();

        System.out.println("Object serialized successfully.");
        }catch(IOException e){
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}
