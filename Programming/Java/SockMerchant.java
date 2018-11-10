/*John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    static int sockMerchant(int n, int[] ar) 
    {
        int C=0;
        int A1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(A1[i]==1)
            {
                continue;
            }
            for(int j=0;j<n;j++)
            {
                if(i==j||A1[j]==1)
                {
                    continue;
                }
                else if(ar[i]==ar[j])
                {
                    C++;
                    A1[i]=1;
                    A1[j]=1;
                    break;
                }
            }
        }
        return C;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++)
        {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
