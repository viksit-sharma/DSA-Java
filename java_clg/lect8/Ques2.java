package lect8;
//Create an abstract class 'Animal' with method 'sound()'. Create classes 'Dog' and 'Cat' that extend it and implement the sound method.
public class Ques2 {
    public static void main(String[] args) {
        Cat Billu = new Cat();
        Billu.sound();
        Dog Sheru = new Dog();
        Sheru.sound();
    }
}

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow meowwww!!!");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bhau bhauuu!!!");
    }
}