public class PrimeNumberRecursion {
    public static void main(String[] args) {
        int number = 17; 
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return (number == 2);
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }
}
