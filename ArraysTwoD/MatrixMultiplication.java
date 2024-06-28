package ArraysTwoD;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] m1= {{1,2,3},{4,5,6}};              //2x3
        int [][] m2 = {{1,2,3,4},{1,2,3,4},{1,2,3,4}}; //3*4

        int result[][] = new int [2][4];

        for(int i =0;i<result.length;i++)
        {
            for(int j = 0;j<result[i].length;j++)
            {
                int digit =0;
                for(int k =0;k<m2.length;k++)
                {
                    digit = digit + m1[i][k]*m2[k][j];
                }
                result[i][j]= digit;
                System.out.print(digit+" ");
            }
            System.out.println();
        }
    }
}
