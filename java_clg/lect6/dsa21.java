package lect6;
//static ke andar non static nhi use ho sakta lekin non static ke andar static use kar sakte hai 
//non static ke andar non static use kar sakte hai aur static bhi
//non static ko static ke andar use karne ke liye object banana padta hai
class bike {

    String name = "Jawa";//non static
    void printName() {//non static
        System.out.println(name);
    }
    
    static String type = "Cruiser";//static

    void printType() {//non static
        System.out.println(type);
    }
    
    String speed = "200 Km/Hr";// non static
    static void printSpeed() {//static
        bike b = new bike();
        System.out.println(b.speed);
    }
    
    static String tank = "20 L";//static
    static void printTank() {//static
        bike b = new bike();
        System.out.println(b.tank);
    }
}
public class dsa21 {
    public static void main(String[] args) {
        bike c = new bike();
        c.printName();
        c.printType();
        c.printSpeed();
        c.printTank();
    }
}
