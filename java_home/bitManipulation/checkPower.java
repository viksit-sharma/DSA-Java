package bitManipulation;

public class checkPower {
    // public static void check2toThePowerMine(int num) {//NOT WORKING
    //     int copy = num;
    //     for (int i = 0; i < copy; i++) {
    //         if (num == (int) Math.pow(2, i)) {
    //             System.out.println("Yes, the no is " + i + "th power of 2");
    //             return;
    //         }
    //         System.out.println(i);
    //         copy /= 2;
    //     }
    //     System.out.println("No, the no is not in the power of 2");
    // }
    public static boolean check2toThePower(int num) {
        return ((num & (num - 1)) == 0);//1000 & 0111 == 0 means num is in power of two
    }
    public static void main(String[] args) {
        check2toThePower(16);
        // if (num == true) {
        //     System.out.println("Is in power of two");
        // }
        // else {
        //     System.out.println("Is not in power of two");
        // }
    }
}
