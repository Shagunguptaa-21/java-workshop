public class Studentmarksarray {
    public static void main(String[] args) {
        int marks[] = {85, 90, 78, 92, 88, 95, 80, 82, 91, 87};

        System.out.println("Marks of students: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}
