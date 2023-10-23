import java.util.Scanner;
public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter Size:\t");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
            System.out.print("  ");
            for(j=i;j<=n;j++)
            {
                if(j==i||i==1||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
// * * * * *        
//   *     *        
//     *   *        
//       * *        
//         *