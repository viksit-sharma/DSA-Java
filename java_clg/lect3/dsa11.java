package lect3;

public class dsa11 {
    public static void main(String[] args) {
        String a = "dood";
        String b = "";
        for (int i = a.length()-1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b)) {
            System.out.println("palindrome hai");
        }
        else {
            System.out.println("palindrome nhi hai");
        }
    }
}
