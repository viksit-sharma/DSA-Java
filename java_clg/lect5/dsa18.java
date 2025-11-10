package lect5;

public class dsa18 {
    public static void main(String[] args) {
        String str = "i love java";
        StringBuilder result = new StringBuilder();
        String s[] = str.split(" ");
        for (int i = 0; i < 3; i++) {
            StringBuilder strr = new StringBuilder(s[i]);
            result.append(strr.reverse()).append(" ");
        }
        System.out.println(result);
    }
}
