package bitManipulation;

public class countSetBits {
    //NOT WORKING PROPERLY
    public static int counterMine(int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if ((num & (1 << i)) != 0) {
                count++;
            }
            // System.out.println(i);
        }
        return count;
    }
    //WORKING PROPERLY
    public static int counter(int num) {
        int count = 0;
        while(num>0){
            if ((num & 1)!=0) { //no. of bits in a binary no. is log of that no. in decimal to the base 2 + 1
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(counter(10));
    }
}
