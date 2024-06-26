package Arrays;

/**
 * SpanOfArray
 */
public class SpanOfArray {

    public static void main(String[] args) {
        int arr [] = {1,8,6,9,8,2,3};
        int span = 0;
        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        span = max-min;
        System.out.println(span);
    }
}