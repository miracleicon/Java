import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:\t");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<n*2;i++){
            for(int j=1;j<n*2;j++){
                if((i<=n&&i+j>n+1&&j+1<i+n)||(i>=n&&j+n>i+1&&i+j+1<n*3)){
                    System.out.print(". ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
// * * * * * * * * * 
// * * * * . * * * * 
// * * * . . . * * * 
// * * . . . . . * * 
// * . . . . . . . * 
// * * . . . . . * * 
// * * * . . . * * * 
// * * * * . * * * * 
// * * * * * * * * * 