
public class dsa6 {
    public static void main(String[] args) {

        short a = 130;
        byte b = (byte) a;//forced type casting from short(big) to byte(small)
        System.out.println(b);

        byte c = 127;
        short d = c;//automatic type casting from byte(small) to short(big)
        System.out.println(d);
    }
}
