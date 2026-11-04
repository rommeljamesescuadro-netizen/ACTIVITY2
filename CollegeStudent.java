

public class CollegeStudent extends Student {

    private String scholarshipStatus;
    
    public CollegeStudent(String name, String studentId,
                          String course, int yearLevel,
                          String scholarshipStatus) {

        super(name, studentId, course, yearLevel);
        setScholarshipStatus(scholarshipStatus);
    }

    public String getScholarshipStatus() {
        return scholarshipStatus;
    }

    public void setScholarshipStatus(String scholarshipStatus) {
        if (scholarshipStatus != null &&
            !scholarshipStatus.trim().isEmpty()) {

            this.scholarshipStatus = scholarshipStatus;
        } else {
            System.out.println("Invalid scholarship status!");
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Scholarship: " + scholarshipStatus);
    }
}
