// Lab12Demo.java
// Simple Console-based Student Record System
// Works directly in Notepad + Command Prompt (no JavaFX needed)

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String id;
    String course;

    Student(String name, String id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | ID: " + id + " | Course: " + course;
    }
}

public class Lab12Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> records = new ArrayList<>();

        System.out.println("=================================");
        System.out.println("   STUDENT RECORD SYSTEM (Lab 12)");
        System.out.println("=================================");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Record");
            System.out.println("2. View All Records");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine().trim();

                System.out.print("Enter Student ID: ");
                String id = sc.nextLine().trim();

                System.out.print("Enter Course: ");
                String course = sc.nextLine().trim();

                if (name.isEmpty() || id.isEmpty() || course.isEmpty()) {
                    System.out.println("⚠ Please fill all fields!");
                } else {
                    records.add(new Student(name, id, course));
                    System.out.println("✅ Record Added Successfully!");
                }

            } else if (choice == 2) {
                if (records.isEmpty()) {
                    System.out.println("No records found.");
                } else {
                    System.out.println("\n--- Student Records ---");
                    for (int i = 0; i < records.size(); i++) {
                        System.out.println((i + 1) + ". " + records.get(i));
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting... Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
