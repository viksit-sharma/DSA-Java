package strings;

import java.util.Scanner;

public class printLargestString {
    public static String Largest(String[] str) {
        String largest = str[0];
        for (String s : str) {
            if (largest.compareTo(s) < 0) {
                largest = s;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String str[] = {"aaabbbcccddd","aaabbbcccdde","aaabbbcccddf"};
        String largest = Largest(str);
        System.out.println(largest);
    }
}
