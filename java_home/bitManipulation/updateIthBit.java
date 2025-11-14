package bitManipulation;

public class updateIthBit {
    public static int clearIthMine(int num, int pos) {
        return ((num ^ (int) Math.pow(2, pos)));
    }

    public static void setIthMine(int num, int pos) {
        System.out.println((num | (int) Math.pow(2, pos)));
    }

    public static void updateIthBitMine(int num, int pos, int newBit) {
        if (newBit == 0) {
            clearIthMine(num, pos);
        } else if (newBit == 1) {
            setIthMine(num, pos);
        }
    }

    public static int updateIthBit(int num, int pos, int newBit) {
        int cleared = clearIthMine(num, pos);
        int bitMask = newBit << pos;
        return cleared | bitMask;
    }
    
    public static void main(String[] args) {
        System.out.println(updateIthBit(22, 2, 0));
        System.out.println(updateIthBit(22, 3, 1));
    }
}
