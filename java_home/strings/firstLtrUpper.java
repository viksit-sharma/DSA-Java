package strings;
public class firstLtrUpper {
    public static String toUpperCase(String str) {
        StringBuilder string = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (i==0) {
                string.append(Character.toUpperCase(str.charAt(0)));
            } else if (str.charAt(i) == ' ') {
                string.append(str.charAt(i));
                i++;
                string.append(Character.toUpperCase(str.charAt(i)));
            } else {
                string.append(str.charAt(i));
            }
        }
        return string.toString();
    }
    public static void main(String[] args) {
        String str = "hare krishna hare krishna krishna krishna hare hare hare raam hare raam raam raam hare hare";
        String res = toUpperCase(str);
        System.out.println(res);
    }
}
