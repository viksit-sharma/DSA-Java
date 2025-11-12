package lect6;
//Create a class Student with fields name, rollNumber, and marks. Write a method to display student details. Create 3 student objects and display their data
class student {
    String name;
    String roll;
    int marks;

    void displayInfo() {
        System.out.println(this.name + "\n" + this.roll + "\n" + this.marks);
        System.out.println("=============");
    }
}
public class dsa22 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Surya";
        s1.roll = "0246CS241339";
        s1.marks = 1000;

        student s2 = new student();
        s2.name = "Viksit";
        s2.roll = "0246CS241373";
        s2.marks = 90;

        student s3 = new student();
        s3.name = "Akshay";
        s3.roll = "0246CS241037";
        s3.marks = 100;

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
