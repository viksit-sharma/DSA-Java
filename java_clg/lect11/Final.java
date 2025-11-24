package lect11;

public class Final {
    public static void main(String[] args) {
        final String username = "rupesh-69";
        f1 f = new f1();
        f.printUser(username);
    }
}
class f1{
    final void printUser(String x){
            System.out.println(x);
    }
}