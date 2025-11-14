package bitManipulation;

public class clearLastIthBits {
    public static void clearBits(int num, int pos) {
        int bitMask = (~0) << pos;// (11111111<<pos)
        System.out.println(bitMask & num);
    }
    public static void main(String[] args) {
        clearBits(15, 2);
    }
} 
