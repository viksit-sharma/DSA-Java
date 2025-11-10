package lect4;
import java.util.Arrays;

public class dsa16 {
    public static void main(String[] args) {
        String str = "hello";
        String strr = "lleho";
        if(str.length()==strr.length())
        {
            char str1[] = str.toCharArray();
            char strr1[] = strr.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(strr1);
            for (int i = 0; i < str.length(); i++) {
                if (str1[i] != strr1[i]) {
                    System.out.println("Is Not Aligram");
                    return;
                }
            }
            System.out.println("Is Aligram");
        }
        else {
            System.err.println("Is Not Aligram");
        }
    }
}
