package Arrays;

public class BarChart {
    public static void main(String[] args) {
        int arr[] = {3,1,0,7,5};
        int maxV = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>maxV)
            {
                maxV= arr[i];
            }
        }
        for(int i =0;i<maxV;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                if(maxV-i<=arr[j])
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
