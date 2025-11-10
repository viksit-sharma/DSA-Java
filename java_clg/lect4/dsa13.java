package lect4;

//REMOVE DUPLICATE FROM STRING
public class dsa13 {
    public static void main(String[] args) {
        String strOg = "hello";
        String strDc = "";
        for (char ch : strOg.toCharArray()) {
            if (strDc.indexOf(ch) == -1) {
                strDc += ch;
            }
        }
        System.out.println(strDc);
    }
}
