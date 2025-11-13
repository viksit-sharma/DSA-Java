package strings;

import java.util.Scanner;

public class shortestPath {
    public static double shortestP(String str) {
        int x = 0, y = 0;
        char str2[] = str.toCharArray();
        for (char c : str2) {
            if (c == 'W'||c=='w') {
                x--;
            } else if (c == 'E'||c=='e') {
                x++;
            } else if (c == 'S'||c=='s') {
                y--;
            } else if (c == 'N'||c=='n') {
                y++;
            }
        }
        double shortPath = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return shortPath;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        double res = shortestP(str);
        System.out.println("Shortest path is " + res);
        
    }
}
