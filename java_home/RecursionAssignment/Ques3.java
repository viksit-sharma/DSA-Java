package RecursionAssignment;
/**
 * Question 3 :Write a program to find Length of a String using Recursion.
 */
public class Ques3 {
    public static int length(String str, int idx) {
        try {
            str.charAt(idx);
            return length(str, idx + 1);
        }
        catch (StringIndexOutOfBoundsException e) {
            return idx;
        }
    }
    public static void main(String[] args) {
        System.out.println("Length of given string is : "+length("hallo", 0));
    }
}
