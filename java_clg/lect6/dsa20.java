package lect6;

public class dsa20 {
    int data1 = 40;
    static int data = 20;

    void Hello() {
        System.out.println("Hello");
    }
    static void Bye() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        dsa20 obj = new dsa20();//made object to accese things defined in the outermost class inside the main class without usig static
        System.out.println(data);
        System.out.println(obj.data1);
        obj.Hello();
        Bye();
    }
}
