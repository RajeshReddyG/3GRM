/*Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. 
Print the decimal value of each fraction on a new line.*/
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
        int arr[] = new int[n];
        int Po=0,Ne=0,Ze=0;
        for(int arr_i=0; arr_i < n; arr_i++)
        {
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                Po++;
            else if(arr[arr_i]==0)
                Ze++;
            else
                Ne++;
        }
        //float PF=Po/n;
        System.out.print((float)Po/n+"\n"+(float)Ne/n+"\n"+(float)Ze/n);
    }
}
