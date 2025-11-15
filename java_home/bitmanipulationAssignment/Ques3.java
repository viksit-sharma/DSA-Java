package bitmanipulationAssignment;
//Question 3 : Add 1 to an integer using Bit Manipulation.(Hint : try using Bitwise NOT Operator)
public class Ques3 {
    public static int sum(int num) {
        int num1 = num+1;
        int i = 0;
        do {
            if (num == 0) {
                num = num | (1 << i);
            }
            else if (((num & (1 << i)) >= 1)) {
                num = num ^ (1 << i);
            } else {
                num = num | (1 << i);
                return num;
            }
            i++;
            num1 = (num1 >> 1);
        } while (num1 > 0);
        return num;
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
