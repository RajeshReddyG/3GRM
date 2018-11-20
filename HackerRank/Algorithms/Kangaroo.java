/*
You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

For example, kangaroo  starts at  with a jump distance  and kangaroo  starts at  with a jump distance of . After one jump, they are both at , (, ), so our answer is YES.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    static String kangaroo(int x1, int v1, int x2, int v2) 
    {
        if(v1<v2&&x1<x2 || v2<v1&&x2<x1)
            return "NO";
        int L1=x1,L2=x2;
        int C=0;
        for(;;)
        {
            L1=L1+v1;
            L2=L2+v2;
            if(L1==L2)
            {
                return "YES";
            }
            C++;
            if(C>100000)
            {
                return "NO";
            }
        }
        //int k1=0;
        /*if(v1<v2&&x1<x2 || v2<v1&&x2<x1)
        {
            return "NO";
        }
        else
        {
            return "YES";
        }*/
        
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
