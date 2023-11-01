public class evenrecursion {
    public static boolean isEven(int number) {
        if (number == 0) {
            return true;
        }
        if (number == 1) {
            return false;
        }
        return isEven(number - 2);
    }
    public static void main(String[] args) {
        int number = 10; 
        boolean result = isEven(number);
        if (result) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
