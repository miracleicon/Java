import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            char firstChar = str.charAt(0);
            String restOfString = str.substring(1);
            return reverseString(restOfString) + firstChar;
        }
    }
}
