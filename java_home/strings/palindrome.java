package strings;

import java.util.Scanner;

public class palindrome {
    public static void pal(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Not plaindrome !!!");
                return;
            }
        }
        System.out.println("Is palindrome");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        pal(str);
    }
}