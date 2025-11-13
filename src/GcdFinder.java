public class GcdFinder
{
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println(gcd(a, b));
    }
    static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
}
