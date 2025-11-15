package stringAssignment;

import java.util.*;
// Question 4 : Determine if 2 Strings are anagrams of each other.
// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a study,or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.
public class Ques4 {
    public static void anagram(String str1, String str2) {

        if (str1.length() == str2.length()) {
            char string1[] = str1.toCharArray();
            Arrays.sort(string1);
            char string2[] = str2.toCharArray();
            Arrays.sort(string2);
            for (int i = 0; i < str1.length(); i++) {
                if (string1[i] != string2[i]) {
                    System.out.println("Strings are not Anagram");
                    return;
                }
            }
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
    public static void main(String[] args) {
        anagram("ghocu", "mochu");
    }
}
