package lect8;
//upper casting matlab parent ka reference aur child ka object

//lower casting matlab child ka reference aur parent ka object
public class classesAndObjects {
    public static void main(String[] args) {
        Animal s1 = new Dog();//Upper casting
        s1.name = "Boneyyyy";
        Dog s2 = (Dog) new Animal();//Lower casting
        //s1.sound();//ye nhi chal skta kyuki parent reference hai, object child ka hai 
        s2.sound();//ye chalega kyuki child reference hai, object parent ka hai

    }
}
class Animal {
    String name;

    void eat() {
        System.out.println("Is eatingggg");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Is eatingggg bone");
    }

    void sound() {
        System.out.println("Barkingggg!!!");
    }
}

