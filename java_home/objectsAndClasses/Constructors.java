package objectsAndClasses;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Sonali", 245, "sonali123", new int[] { 98, 91, 93 });
        Student s2 = new Student(s1);
        s2.password = "sonali456";
        s1.marks[0] = 99;

        System.out.println("Marks of s1 : "+s1.name + " " + s1.roll + " " + s1.password + " ");
        for (int mark : s1.marks) {
            System.out.println(mark+" ");
        }
        System.out.println("Marks of s2 : "+s2.name + " " + s2.roll + " " + s2.password + " ");
        for (int mark : s2.marks) {
            System.out.println(mark+" ");
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //COPY CONSTRUCTOR
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        //CREATING SHALLOW COPY
        this.marks = s.marks;
        //CREATING DEEP COPY
        // this.marks = new int[s.marks.length];
        // for (int i = 0; i < s.marks.length; i++) {
        //     this.marks[i] = s.marks[i];
        // }
    }

    Student(String name, int roll, String password, int marks[]) {
        this.name = name;
        this.roll = roll;
        this.password = password;
        this.marks=marks;
    }
}