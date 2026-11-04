

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
            "Ana Cruz", "STU001", "BSIT", 2
        );

        Student student2 = new Student(
            "Mark Reyes", "STU002", "BSCS", 1
        );

        CollegeStudent student3 = new CollegeStudent(
            "Lea Santos", "STU003", "BSIT", 3, "Full Scholar"
        );

        Student[] students = {student1, student2, student3};

        System.out.println("===== STUDENT INFORMATION =====");

        for (Student student : students) {
            if (student instanceof CollegeStudent) {
                System.out.println("\n===== COLLEGE STUDENT =====");
            }

            student.displayInfo();
            System.out.println();
        }

        System.out.println("===== UPDATED INFORMATION =====");

        student1.setYearLevel(4);

        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Year Level: " + student1.getYearLevel());

        System.out.println("\n===== INVALID UPDATE TEST =====");

        student1.setYearLevel(5);
        student1.setName("");
        student1.setStudentId("ABC001");
        student1.setCourse("");

        System.out.println("\n===== CURRENT STUDENT INFORMATION =====");
        student1.displayInfo();

        System.out.println("\nTotal Student Objects Created: "
                + Student.getStudentCount());
    }
}
