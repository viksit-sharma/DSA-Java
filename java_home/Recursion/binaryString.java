package Recursion;

public class binaryString {
    // static StringBuilder sb = new StringBuilder();

    // public static String binStr(String str, int idx) {
    //     if (idx == str.length()) {
    //         return sb.toString();
    //     } else if ((idx > 0) && (str.charAt(idx)=='1') && (str.charAt(idx - 1) == str.charAt(idx))) {
    //         return binStr(str, idx + 1);
    //     } else {
    //         sb.append(str.charAt(idx));
    //         return binStr(str, idx + 1);
    //     }
    // }
    public static void binStr(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binStr(n - 1, 0, str+("0"));
        if (lastPlace == 0) {
            binStr(n-1, 1, str+("1"));
        }
    } 
    public static void main(String[] args) {
        // System.out.println(binStr("011010100110", 0));
        binStr(3, 0,"");
    }
}
