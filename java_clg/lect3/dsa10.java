package lect3;

public class dsa10 {
    public static void main(String[] args) {
        String str2 = "hello";
        String str3 = "hello";

        System.out.println("Same reference");
        System.out.println(str3 == str2);
        System.out.println(str2.equals(str3));

        System.out.println();
        
        String str = new String("hello");
        String str1 = new String("hello");
        
        System.out.println("Different reference");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }
}
