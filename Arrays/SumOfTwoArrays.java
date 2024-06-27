package Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int arr[] =   {1};
        int arr2[]= {8,9,9,9};
        int result [] = new int [arr2.length+1];
        int i = arr.length-1;
        int j = arr2.length-1;
        int k = result.length-1;
         int digit = 0;
         int carry = 0;
        
        while(k>=0)
        {
         if(i>=0)
         {
            // System.out.println(i);
            digit = arr[i]+arr2[j]+carry;
         }
         else if(j>=0)
         {
            digit = arr2[j]+carry;
         }
         else 
         {
            digit = carry;
         }
         if(digit>=10)
         {
            carry = 1;
            result[k]= digit%10;
         }
         else  
         {
            carry = 0;
            result[k]= digit;
         }
         i--;
         j--;
         k--;
        }
      for (int l : result) {
         System.out.print(l);
      }
   }
}