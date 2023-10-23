import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:\t");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<n*2;i++){
            for(int j=1;j<n*2;j++){
                if(i==n||j==n||(i==1&&j<n)||(i==n*2-1&&j>n)||(j==1&&i>n)||(j==n*2-1&&i<n)){
                    System.out.print("* ");
                }
                else if(i==j||i+j==n*2){
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
//   *       *       * * 
//     *     *     *   * 
//       *   *   *     * 
//         * * *       * 
// * * * * * * * * * * * 
// *       * * *
// *     *   *   *       
// *   *     *     *     
// * *       *       *   
// *         * * * * * * 