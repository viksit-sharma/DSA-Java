package objectsAndClasses.Inheritance;
//SINGLE INHERITANCE
public class SingleLvlInheritance {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.color = "Golden";
        tuna.noOfFins = 256;
        System.out.println("Color : "+tuna.color+"\nNo of fins : "+tuna.noOfFins);
        tuna.eat();
        tuna.breath();
        tuna.swim();
    }
}
//Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breath() {
        System.out.println("Breathing");
    }
}
//Child class
class Fish extends Animal {
    int noOfFins;

    void swim() {
        System.out.println("Swiming");
    }
}
