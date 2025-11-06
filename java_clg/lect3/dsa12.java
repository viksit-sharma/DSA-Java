package lect3;

public class dsa12 {
    public static void main(String[] args) {
        String str = "java cpp c php js";
        String a[] = str.split("");
        for (String val : a) {
            System.out.print (val+" ");
        }
        System.out.println(a.length);
    }
}
