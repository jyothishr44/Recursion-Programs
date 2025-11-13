public class PrintNumbersWithoutLoop
{
    static void printNumbers(int n){
        if(n>50) return;

        System.out.print(n+" ");
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        printNumbers(1);
    }
}
