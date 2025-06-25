import java.util.ArrayList;
import java.util.Scanner;

public class studentManagement {
    static ArrayList<student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        student s = new student(id, name, marks);
        studentList.add(s);
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Student List:");
            for (student s : studentList) {
                System.out.println(s);
            }
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (student s : studentList) {
            if (s.id == id) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new marks: ");
                double marks = scanner.nextDouble();

                s.name = name;
                s.marks = marks;
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = scanner.nextInt();

        for (student s : studentList) {
            if (s.id == id) {
                studentList.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
