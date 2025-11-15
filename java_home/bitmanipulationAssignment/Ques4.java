package bitmanipulationAssignment;

public class Ques4 {
    // Question 4 : This question is based on a trick, please directly look at the solution. Convert uppercase characters to lowercase using bits.
    public static void main(String[] args) {// Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {// ADDING 32 TO THE CURRENT ASCII VALUE BECAUSE AFTER 32 ELEMENTS OF ANY CAPITAL LETTER SMALL LETTERS COMES LIKE : A(65) + ' '(32) = a(97) so we used | operator to add them and got exact sum i.e. 97
            System.out.print((int) (ch | ' ')+"->");
            System.out.println((char) (ch | ' '));// prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
