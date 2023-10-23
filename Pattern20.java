import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:\t");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<n*2;i++){
            for(int j=1;j<n*2;j++){
                if(i==1||j==1||i==n*2-1||j==n*2-1){
                    System.out.print("* ");
                }
                else if(i==n||j==n||i+j==n+2||i+2==j+n||i+n==j+2||i+j+2==n*3){
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
// * * * * * * * * * * * 
// *         *         * 
// *       * * *       * 
// *     *   *   *     * 
// *   *     *     *   * 
// * * * * * * * * * * * 
// *   *     *     *   * 
// *     *   *   *     * 
// *       * * *       * 
// *         *         * 
// * * * * * * * * * * * 