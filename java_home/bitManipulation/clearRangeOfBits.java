package bitManipulation;

public class clearRangeOfBits {
    public static void clearBitsMine(int num, int start, int end) {
        int bitMask1 = (~0) << start+1;
        int bitMask2 = ~((~0) << end);
        int bitMask = bitMask1 | bitMask2;
        System.out.println(num & bitMask);
    }
    public static void clearBits(int num, int start, int end) {
        int bitMask1 = (~0) << start+1;
        int bitMask2 = (1<<end)-1;//2 ki power kisi number mein se minus 1 karne par starting se utne place par 1 aa jata hai aur uske aage 0 aa jata hai eg: 5 bar starting se 1 chahiye tab 2^5-1 in binary = 00011111 
        int bitMask = bitMask1 | bitMask2;
        System.out.println(num & bitMask);
    }
    public static void main(String[] args) {
        clearBits(10, 4, 2);
    }
}
