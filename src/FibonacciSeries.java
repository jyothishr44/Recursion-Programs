public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int n = 10;
        for(int i = 0; i<n; i++)
            System.out.print(fibo(i)+" ");
    }
    static int fibo(int n){
        return n<=1 ? n : fibo(n-1) + fibo(n-2);
    }
}
