public class SquarePattern {
    public static void main(String[] args) {
        int n = 5; 
        printSquarePattern(n);
    }
    public static void printSquarePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
