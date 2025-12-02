package RecursionAssignment;
/**
 * Question 2 :You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.  Use a recursive function to solve this problem.
 * NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
 * Sample Input: 1947
 * Sample Output: “one nine four seven”
 */
public class Ques2 {
    static StringBuilder words = new StringBuilder();

    public static void digitInWords(int n) {
        if (n > 0) {
            switch (n % 10) {
                case 1:
                    digitInWords(n / 10);
                    words.append(" one ");
                    break;
                case 2:
                    digitInWords(n / 10);
                    words.append(" two ");
                    break;
                case 3:
                    digitInWords(n / 10);
                    words.append(" three ");
                    break;
                case 4:
                    digitInWords(n / 10);
                    words.append(" four ");
                    break;
                case 5:
                    digitInWords(n / 10);
                    words.append(" five ");
                    break;
                case 6:
                    digitInWords(n / 10);
                    words.append(" six ");
                    break;
                case 7:
                    digitInWords(n / 10);
                    words.append(" seven ");
                    break;
                case 8:
                    digitInWords(n / 10);
                    words.append(" eight ");
                    break;
                case 9:
                    digitInWords(n / 10);
                    words.append(" nine ");
                    break;
                case 0:
                    digitInWords(n / 10);
                    words.append(" zero ");
                    break;
            }
        } else {
            return;
        }
    }
    public static void main(String[] args) {
        digitInWords(2020);
        System.out.println(words);
    }
}
