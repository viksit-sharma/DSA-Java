package lect11.src;
import lect11.src.package1.A;
// import lect11.src.package4.D;
import lect11.src.package4.E;
import lect11.src.package2.B;
import lect11.src.package3.C;
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.callA();
        B b = new B();
        b.callB();
        C c = new C();
        c.callC();
        // D d = new D();
        // d.callD();
        E e = new E();
        e.callE();
    }
}
