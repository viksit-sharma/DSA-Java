package stringAssignment;
// Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.
public class Ques1 {
    public static int counter(String str) {
        String str1 = str.toLowerCase();
        String vowel = "AEIOUaeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str1.charAt(i) == str.charAt(i) && vowel.contains(str.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int noOfLowerCaseVowel = counter("I love My Amazing India");
        System.out.println(noOfLowerCaseVowel);
    }
}
