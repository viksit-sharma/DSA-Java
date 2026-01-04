package lect1;
public class checkPalid {
    public static void main(String[] args) {
        String str = "MalayalaM";
        for (int i = 0; i < 9; i++) {
            if (str.charAt(i) != str.charAt(8-i)) {
                System.out.println("Is not palindrome");
                return;
            }
        }
        System.out.println("Is palindrome");
    }
}
 