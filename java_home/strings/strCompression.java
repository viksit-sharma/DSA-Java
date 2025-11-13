package strings;

public class strCompression {
    // public static void Compressor(String str) {
    //     char prev = ' ';
    //     int len = str.length();
    //     char st[] = str.toCharArray();
    //     int i = 0;
    //     while (len > 0) {
    //         int count = 1;
    //         for (; i < str.length() - 1; i++) {
    //             if (st[i] == st[i + 1]) {
    //                 count++;
    //                 prev = st[i];
    //                 len--;
    //             }
    //         }
    //         if (prev == st[i]) {
    //             System.out.println(prev +" "+ count);
    //         }
    //     }
    // }
    public static void Compressor(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
        System.out.print(str.charAt(str.length() - 1));
        System.out.print(count);
    }
 
    public static void main(String[] args) {
        String str = "aaabbsgd";
        Compressor(str);
    }
}
