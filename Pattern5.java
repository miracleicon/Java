import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:\t");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 