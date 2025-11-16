package objectsAndClasses.Inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();

        System.out.println(Herbivore.food);
        System.out.println(Carnivore.food);
        b.eat();
    }
}

interface Herbivore {
    String food = "Vegetarian";

    void eat();
}

interface Carnivore {
    String food = "Non-Vegetarian";

    void eat();
}

class Bear implements Carnivore, Herbivore {
    public void eat() {
        System.out.println("Eats both grass and animals");
    }
}
