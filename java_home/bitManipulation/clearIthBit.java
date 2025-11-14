package bitManipulation;

public class clearIthBit {
    public static void clearIthMine(int num, int pos) {
        System.out.println((num ^ (int) Math.pow(2, pos)));
    }

    public static void clearIth(int num, int pos) {
        System.out.println((num ^ (1 << pos)));
    }

    public static int clearIth2(int num, int pos) {
        return num & ~(1 << pos);
    }
    public static void main(String[] args) {
        clearIthMine(10, 1);
        clearIth(10, 1);
        System.out.println(clearIth2(10, 1));
    }
}
