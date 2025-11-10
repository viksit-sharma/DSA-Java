package lect4;

public class dsa15 {
    public static void main(String[] args) {
        String str = "Rupesh sir is very good teacher";
        String a[] = str.split(" ");
        String ab="";
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].length() < a[i + 1].length()) {
                ab = a[i + 1];
            } else {
                ab = a[i];
            }
        }
        System.out.println("Total numbers of words : "+a.length);
        System.out.println("Largest word : "+ab);
    }
}