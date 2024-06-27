package Arrays;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int arr[] =   {2};
        int arr2[]= {1,0,0,0};
        int result[] = new int[arr2.length];
        int i = arr.length-1;
        int j = arr2.length-1;
        int k = result.length-1;
        int carry = 0;
        int digit = 0;
        while(k>=0)
        {
            if(i>=0)
            {
                if(arr2[j]-carry>=arr[i])
                {
                    digit = arr2[j]-arr[i];
                    carry =0;
                    result[k]= digit;
                }
                else 
                {
                    digit = arr2[j]+10-arr[i]-carry;
                    carry =1;
                    result[k]= digit;

                }
            }
            else 
            {
                if(arr2[j]!=0)
                {
                    digit = arr2[j]-carry;
                result[k]= digit;
                carry = 0;
                }
                else 
                {
                    if(carry ==1)
                    {
                        result[k]= 9;
                        carry =1;
                    }
                }
            }
            i--;
            j--;k--;
        }
        for (int l : result) {
            System.out.print(l);
        }
    }
}
