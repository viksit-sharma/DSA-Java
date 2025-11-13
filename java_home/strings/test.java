package strings;

public class test {
    public static String toUpperCase(String str) {
        StringBuilder st = new StringBuilder("");
        st.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                st.append(str.charAt(i));
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));
            } else {
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String str = "jai shree raam";
        System.out.println(toUpperCase(str));
    }
}
