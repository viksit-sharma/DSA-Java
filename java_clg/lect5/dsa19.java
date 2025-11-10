package lect5;

public class dsa19 {
    public static void main(String[] args) {
        String str = "aabbcaadd5656565655grrjj  ";
        int j = 1;
        char s[] = str.toCharArray();
        for (int i = 0; i < str.length()-1 && j <str.length()-1 ; i++) {  
            int count = 1;
            while (s[j-1] == s[j ]) {
                count += 1;
                j++;
                i++;
            }
            j++;
            System.out.print(s[i]+" "+count+" ");
        }
    }
}
