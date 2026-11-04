
public class Student {

    private String name;
    private String studen tId;
    private String course;
    private int yearLevel;

    private static int studentCount = 0;

    public Student(String name, String studentId, String course, int yearLevel) {
        setName(name);
        setStudentId(studentId);
        setCourse(course);
        setYearLevel(yearLevel);

        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Name cannot be empty.");
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && studentId.startsWith("STU")) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid ID! ID must start with STU.");
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (course != null && !course.trim().isEmpty()) {
            this.course = course;
        } else {
            System.out.println("Invalid course! Course cannot be empty.");
        }
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        if (yearLevel >= 1 && yearLevel <= 4) {
            this.yearLevel = yearLevel;
        } else {
            System.out.println("Invalid year level! Enter 1 to 4 only.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
