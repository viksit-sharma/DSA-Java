package lect13;

import java.util.*;
public class objectSorting {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(373, "Viksit"));
        list.add(new Student(037, "Akshay"));
        list.add(new Student(339, "Surya"));
        Collections.sort(list,new Student(0,""));
        System.out.println(list);
    }
}

/**
 * 4
 * 3,2,1,0
 * 0,1,0,2,1,3,2
 */
// class Student implements Comparable<Student> {
//     String name;
//     int rollNo;

//     public Student(int rollNo, String name) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     public int compareTo(Student s) {
//         return this.rollNo - s.rollNo;
//     }

//     public String toString() {
//         return rollNo + " " + name;
//     }
// }

class Student implements Comparator<Student>{
    String name;
    int rollNo;

    public Student(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }

    public String toString() {
        return rollNo + " " + name;
    }
}