package lect9;
// Q5. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...". Create a class Car that implements Vehicle. Call the default method from an object of Car in the main method
public class Ques5 {
    public static void main(String[] args) {
        Car i10 = new Car();
        i10.start();
    }
}

interface Vehical{

    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehical {
    void sound() {
        System.out.println("Peep peeppp!!!");
    }
}
