import java.util.Scanner;
public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter Size:\t");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i||i==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
// *
// * *       
// *   *     
// *     *   
// * * * * * 