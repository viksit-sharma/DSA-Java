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
    public static String Compressor(String str) {
        int count = 1;
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                st.append(str.charAt(i));
                if (count > 1) {
                    st.append(count);
                }
                
                count = 1;
            }
        }
        st.append(str.charAt(str.length() - 1));
        if (count > 1) {
            st.append(count);
        }
        
        return st.toString();
    }
 
    public static void main(String[] args) {
        String str = "aaabbsgd";
        String res = Compressor(str);
        System.out.println("Compressed string is : "+res);
    }
}
