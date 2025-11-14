package bitManipulation;

public class getIthBit {
    public static void getIthMine(int num, int pos) {
        if ((num & (int) Math.pow(2, pos)) == (int) Math.pow(2, pos)) {
            System.out.println(pos + "th bit is " + 1);
        } else {
            System.out.println(pos + "th bit is " + 0);
        }
    }
    public static void getIth(int num, int pos) {
        
        if ((num & (1<<pos))==0) {
            System.out.println(pos + "th bit is " + 0);
        } else {
            System.out.println(pos + "th bit is " + 1);
        }
    }
    public static void main(String[] args) {
        getIth(10, 0);
    }
}
