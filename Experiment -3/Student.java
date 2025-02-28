class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 19;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
       
        Student student1 = new Student(); 
        Student student2 = new Student("Vansh Thakral", 20); 

        student1.display();
        student2.display();
    }
}
