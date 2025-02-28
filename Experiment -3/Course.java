class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }

    public static void main(String[] args) {

        Course course1 = new Course("Java Programming", "CS1090");

        course1.displayCourseDetails();
    }
}
