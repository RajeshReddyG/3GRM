/*
 * https://www.hackerrank.com/challenges/between-two-sets/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    static int getTotalX(int[] a, int[] b)
    {
        int n=-1,Count=0;
        for(int x=1;x<=100;x++)
        {
            for(int i=0;i<a.length;i++)
            {
                if(x%a[i]!=0)
                {
                    n=-1;
                    break;
                }
                if(x%a[i]==0)
                {
                    n=x;
                }
            }
            if(n!=-1)
            {
                for(int i=0;i<b.length;i++)
                {
                    if(b[i]%x!=0)
                    {
                        n=-1;
                        break;
                    }
                    if(b[i]%x==0)
                    {
                        n=x;
                    }
                }
                if(n==x)
                {
                    Count++;
                }
            }
        }
        return Count;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++)
        {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}

