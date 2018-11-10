/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++)
        {
            for(int a_j=0; a_j < n; a_j++)
            {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int D1=0;
        for(int a_i=0; a_i < n; a_i++)
        {
            D1=D1+a[a_i][a_i];
        }
        int D2=0,C=n-1;
        for(int a_i=0; a_i < n; a_i++)
        {
            D2=D2+a[a_i][C];
            C--;
        }
        System.out.println(Math.abs(D1-D2));
        //System.out.println(D1);System.out.println(D2);
    }
}

