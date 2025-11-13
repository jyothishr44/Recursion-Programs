import java.util.Arrays;

public class ReverseArray
{
    static void reverse(int nums[], int start, int end){
        if(start>=end)
            return;

        var temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        reverse(nums, start+1, end-1);
    }
    public static void main(String[] args) {
        int arr[] = {5, 8, 9, 3, 0, 5};
        reverse(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
