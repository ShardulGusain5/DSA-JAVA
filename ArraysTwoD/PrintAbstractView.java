package ArraysTwoD;

public class PrintAbstractView {
    public static void main(String[] args) {
        int [][] arr = new int [2][3];
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(i+" "+j+",");
            }
            System.out.println();
        }
    }
}
