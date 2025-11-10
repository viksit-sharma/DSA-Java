package lect4;
//FREQUENCY COUNTER
public class dsa14 {
    public static void main(String[] args) {
        String str = "namaste";
        String strrr="";
        char strr[]=str.toCharArray();
        for(char ch:str.toCharArray()){
            if (strrr.indexOf(ch) == -1) {
                strrr += ch;
            }
        }
        for (int i = 0; i < strrr.length(); i++) {
            int count = 0;
            
            for (int j = i; j < str.length(); j++) {
                if (strrr == strrr) {
                    count++;
                }
            }
            System.out.println(strr[i]+" = "+count);
        }
    }
}
