 package lect9;

public class interfaces {
    public static void main(String[] args) {
        Bear Bhalu = new Bear();
        Bhalu.eats();
        Bhalu.name = "Bhalu";
        System.out.println(Bhalu.name);
    }
}

interface Herbivore {
     String name="Herbivore";
    void eats();

    // Herbivore(){//INTERFACES CAN NOT HAVE CONSTRUCTOR IN JAVA
    // }
}
interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {
    public String name;

    public void eats() {
        System.out.println("Eats both Grass and Meat");
    }
}