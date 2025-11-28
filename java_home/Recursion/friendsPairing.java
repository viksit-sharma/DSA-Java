package Recursion;

public class friendsPairing {
    public static int pairingWays(int n) {
        if ((n == 1)||(n == 2)) {
            return n;
        }
        else {
            return pairingWays(n - 1)/*ways to pair n-1 friends after removing a friend as single*/ +
            (n - 1)/*ways to pick a friend from n-1 friends*/ *
            pairingWays(n - 2)/*ways to pair remaining friends after picking a pair*/;
        }
    }
    public static void main(String[] args) {
        System.out.println(pairingWays(5));
    }
}
