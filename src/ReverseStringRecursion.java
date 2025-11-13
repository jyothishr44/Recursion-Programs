public class ReverseStringRecursion {
    static void reverse(char[] str, int start, int end)
    {
        if (start >= end)
            return;

        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        reverse(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "mai";
        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length - 1);
        System.out.println("Reversed string: " + new String(arr));
    }
}
