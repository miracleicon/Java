public class sumfunction {
    public static int sumofmultiplesof3and5(int N)
    {
       int total = 0;
       for (int i=0; i<N; i++){
        if(i%3==0 || i%5 == 0)
        {
            total+=i;

        }
       } 
       return total;
    }
    public static void main (String[] args)
    {
        int result = sumofmultiplesof3and5(10);
        System.out.println(result);
    }
}
