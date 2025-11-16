package objectsAndClasses.Inheritance;

public class MultiLvlInheritance {
    public static void main(String[] args) {
        Cat billo = new Cat();
        billo.name = "Billo";
        billo.type = "Cat";
        billo.noOfLegs = 4;
    }
}

class Animal {

    String name;
    String type;
    void eat() {
        System.out.println("Is eating");
    }

    void breath() {
        System.out.println("Is breathing");
    }
}

class Mammal extends Animal {
    int noOfLegs;

    void walk() {
        System.out.println("Is walking");
    }

    void run() {
        System.out.println("Is running");
    }
}

class Cat extends Mammal {
    void sound() {
        System.out.println("Meow meow");
    }
    void play() {
        System.out.println("Is playing");
    }
    void jump() {
        System.out.println("Jumped high");
    }
}