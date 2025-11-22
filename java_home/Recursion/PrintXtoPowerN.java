package Recursion;

public class PrintXtoPowerN {
    public static int pow(int num, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return pow(num, pow-1) * num;
        }
    }

    public static int powO(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        int halfpower = powO(num, pow / 2);
        if (pow % 2 != 0) {
            return halfpower * halfpower * num;
        }
        else {
            return halfpower * halfpower;
        }
    }
    public static void main(String[] args) {
        System.out.println(powO(2,10));
    }
}
