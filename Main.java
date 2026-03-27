import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    void addStudent(int id, String name, int marks) {
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    // View Students
    void viewStudents() {
        for (Student s : students) {
            System.out.println(s.id + " - " + s.name + " - Marks: " + s.marks);
        }
    }

    // Search Student
    void searchStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found: " + s.name + " - Marks: " + s.marks);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    sm.addStudent(id, name, marks);
                    break;

                case 2:
                    sm.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    sm.searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}