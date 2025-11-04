
public class dsa7 {
    public static void main(String[] args) {
        String arr = "rupesh";

        for (int i = 0; i < arr.length(); i++) {
            System.out.print(arr.charAt(i));
        }
        System.out.println();
        // for (int i = arr.length() - 1; i > -1; i--) {
        //     System.out.print(arr.charAt(i));
        // }
        
        String str = arr.concat(" sir");

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // for (int i = str.length()-1; i > -1 ; i--) {
        //     System.out.print(str.charAt(i));
        // }
    }
}
