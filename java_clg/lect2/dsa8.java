import java.util.*;
public class dsa8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        char str1[] = str.toCharArray();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            str1[i] = str.charAt(str.length()-1 - i);
        }
        for (int i = 0; i < str.length(); i++) {
            if (str1[i] != str.charAt(i)) {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
        
    }
}
