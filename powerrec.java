public class PrintDigitsRecursively {
    public static void main(String[] args) {
        int number = 12345;
        printDigits(number);
    }
    public static void printDigits(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            printDigits(number / 10);
        }
    }
}
