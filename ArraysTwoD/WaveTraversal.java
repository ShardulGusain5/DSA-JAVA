package ArraysTwoD;

public class WaveTraversal {
    public static void main(String[] args) {
        int [][] m2 = {{1,2,3,4},{1,2,3,4},{1,2,3,4}}; //3x4

        int row = 0;
        int col =0;
        int i =0;
        while(col<m2[0].length)
        {

        
        if(col%2==0)
        {
            while(row<m2.length)
            {
                System.out.print(m2[row][col]);
                row++;
            }
            row--;
            col++;
            System.out.println();
        }
        else 
        {
            
            while(row>=0)
            {
                System.out.print(m2[i][col]);
                row--;
            }
            row++;
            col++;
            System.out.println();
        }
    }
    }
}
