package objectsAndClasses.Inheritance;

public class HybridInheritance {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.name = "Tuna";
        fish.type = "Friendly";
        fish.noOfFins = 256;

        Cat cat = new Cat();
        cat.name = "Billo";
        cat.type = "Friendly";
        cat.noOfLegs = 4;
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
class Bird extends Animal {
    String flyRange;
    void fly() {
        System.out.println("Is flying");
    }
}
class Aquatic extends Animal {
    int noOfFins;

    void swim() {
        System.out.println("Is swimming");
    }

    void jump() {
        System.out.println("Jumped over the water");
    }
}
class Fish extends Aquatic {
    String size;
}