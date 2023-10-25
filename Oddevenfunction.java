public class Oddevenfunction {
    public static void main(String[] args) {
        int number = 123456789;
        countOddEvenDigits(number);
    }
    public static void countOddEvenDigits(int number) {
        int evenCount = 0;
        int oddCount = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }
        System.out.println("Number: " + number);
        System.out.println("Even Digits: " + evenCount);
        System.out.println("Odd Digits: " + oddCount);
    }
}

