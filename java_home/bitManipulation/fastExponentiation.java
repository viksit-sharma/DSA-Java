package bitManipulation;

public class fastExponentiation {
    public static int exponenter(int num, int pow) {
        int a = num;
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans = a * ans;
                
            } else if ((pow & 1) == 0) {
                ans = 1 * ans;
            }
            a = a * a;
            pow= pow>> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(exponenter(3, 5));
    }
}
