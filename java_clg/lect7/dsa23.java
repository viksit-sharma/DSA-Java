package lect7;

class Car {
    Car() {
        System.out.println("Car Non parameterized constructor");
    }
    Car(String s) {
        System.out.println("Car 1 Parameterized constructor : "+s);
    }
    Car(String company,String model) {
        System.out.println("Car 2 Parameterized constructor : "+company+" "+model);
    }
    Car(String company,String model,int cost) {
        System.out.println("Car 3 Parameterized constructor : "+company+" "+model+" "+cost);
    }
    Car(String company,String model,int cost,int speed) {
        System.out.println("Car 4 Parameterized constructor : "+company+" "+model+" "+cost+" "+speed);
    }
    Car(String company,String model,int cost,int speed,String type) {
        System.out.println("Car 5 Parameterized constructor : "+company+" "+type+" "+model+" "+cost+" "+speed);
    }
}
public class dsa23 {
    public static void main(String[] args) {
        Car lambo = new Car();
        Car bmw = new Car("BMW");
        Car audi = new Car("AUDI","X7");
        Car mazda = new Car("MAZDA","M15",20000000);
        Car ferrari = new Car("FERRARI","F5",60000000,400);
        Car bently = new Car("BENTLY","F5",60000000,400,"Sedan");
    }
}
