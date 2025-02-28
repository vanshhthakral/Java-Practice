class UniversityStudent {
    static String universityName = "Upes University"; 
    String studentName; 

    UniversityStudent(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {
    
        UniversityStudent student1 = new UniversityStudent("Janvi");
        UniversityStudent student2 = new UniversityStudent("Aakash");

        UniversityStudent.displayUniversity();

        System.out.println("Student 1: " + student1.studentName);
        System.out.println("Student 2: " + student2.studentName);
    }
}
