package objectsAndClasses.Inheritance;

public class HierarchialInheritance {
    public static void main(String[] args) {

        Aquatic fish = new Aquatic();
        fish.name = "Tuna";
        fish.type = "Friendly";
        fish.noOfFins = 256;

        Mammal cat = new Mammal();
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

class Aquatic extends Animal {
    int noOfFins;

    void swim() {
        System.out.println("Is swimming");
    }

    void jump() {
        System.out.println("Jumped over the water");
    }
}