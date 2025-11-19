package lect8;

public class absrtact {
    public static void main(String[] args) {
        Animal s1 = new Dog();
        //Dog s2 = (Dog) new Animal();//cant make object of Animal because it's just idea(blueprint of class) not actual class 
    }
}

interface Mammal{
    
}
abstract class Animal {
    abstract void eat();
}

class Dog extends Animal {
    void eat() {
        System.out.println("Is eatinggg bone");
    }
}