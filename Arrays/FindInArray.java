package Arrays;

public class FindInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,5,8,9};
        int key = 2;
        int found = -1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]== key)
            {
                found = i;
            }
        }
        System.out.println(found);
    }
}
