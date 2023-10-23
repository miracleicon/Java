import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:\t");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<n*2;i++){
            for(int j=1;j<n*2;j++){
                if((j<=i&&j>=n)||(j>=i&&j<=n)||(i>=n&&j<=n*2-i)||(i<=n&&j>=n*2-i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// * * * * * *         * 
//   * * * * *       * * 
//     * * * *     * * * 
//       * * *   * * * * 
//         * * * * * * * 
// * * * * * * * * * * * 
// * * * * * * *
// * * * *   * * *       
// * * *     * * * *     
// * *       * * * * *   
// *         * * * * * * 