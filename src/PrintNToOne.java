public class PrintNToOne
{
    static void printReverse(int n){
        if(n == 0) return;

        System.out.print(n+" ");
        printReverse(n-1);
    }

    public static void main(String[] args) {
        printReverse(10);
    }
}
