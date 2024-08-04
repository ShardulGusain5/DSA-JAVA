package Arrays;

import java.util.Scanner;

/**
 * nPr
 */


public class nPr {

    public static int fact (int n)
    {
        int nFact = 1;
        for(int i = 1;i<=n;i++)
        {
            nFact= nFact*i;
        }
        return nFact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();
        int r = scn.nextInt();
        int nFact = fact(n);
        int rFact = fact(n-r);

        System.out.println(nFact/rFact);
    }
}