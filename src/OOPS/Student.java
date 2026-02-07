package OOPS;

public class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) return 'A';
        if (marks >= 75) return 'B';
        if (marks >= 60) return 'C';
        return 'D';
    }

    void displayDetails() {
        System.out.println(id + " " + name + " " + marks + " Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Nikhil", 85);
        s1.displayDetails();
    }
}
