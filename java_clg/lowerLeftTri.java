public class lowerLeftTri {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
