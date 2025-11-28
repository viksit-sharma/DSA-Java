package Recursion;

public class dupliRemove {
    static StringBuilder sb = new StringBuilder();

    public static String duplicateRemover(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            return newStr.toString();
        }
        else if (map[str.charAt(idx) - 'a'] == true) {
            return duplicateRemover(str, idx + 1, newStr, map);
        }
        else {
            map[str.charAt(idx) - 'a'] = true;
            newStr.append(str.charAt(idx));
            return duplicateRemover(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        System.out.println(duplicateRemover("appnnacollege", 0, sb, map));
    }
}
