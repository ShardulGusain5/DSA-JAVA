package Arrays;

public class Difference {
    public static void main(String[] args) {
        int [] first = {1,0,0,0};
        int [] second = {9,9,9};
        int result[]= new int[first.length];
        int i = first.length-1;
        int j = second.length-1;
        int k = result.length-1;
        int carry = 0;
        int secondval= 0;
        while(k>=0)
        {
            if(j>=0)
            {
                secondval = second[j];
            }
            else 
            {
                secondval= 0;
            }
            if(first[i]+carry>=secondval)
            {
                result[k]= first[i]+carry-secondval;
                carry =0;
            }
            else 
            {
                result[k]= first[i]+10+carry-secondval;
                carry = -1;
            }
            i--;
            j--;
            k--;
        }
        int l= 0;
        while(l<=result.length)
        {
            if(result[l]!=0)
            {
                break;
            }
            else 
            {
                l++;
            }
        }
        while(l<result.length)
        {
            System.out.println(result[l]);
            l++;
        }
    }
}
