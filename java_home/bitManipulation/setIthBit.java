package bitManipulation;

public class setIthBit {
    public static void setIthMine(int num, int pos) {
        System.out.println((num | (int) Math.pow(2, pos)));
    }
    public static void setIth(int num, int pos) {
        System.out.println((num | (1<<pos)));
    }
    public static void main(String[] args) {
        setIth(16, 2);
    }
}
