public class digitSum {
    public static void main(String[] args) {
        int num = 123;
        int digSum = 0;
        while (num > 0) {
            int lastDigit = num % 10;

            digSum = digSum + lastDigit;

            num = num / 10;
        }
        System.out.println(digSum);
    }
}
