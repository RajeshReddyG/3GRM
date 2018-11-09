/*return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    static long repeatedString(String S, long n)
    {
        if(S.length()==1 && S.charAt(0)=='a')
            return n;
        
        long C=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='a')
            {
                C++;
            }
        }
        Integer Len=S.length();
        Long T=new Long(Len);
        Long Q=n/T;
        Long R=n%T;
        C=C*Q;
        for(int i=0;i<R;i++)
        {
            if(S.charAt(i)=='a')
            {
                C++;
            }
        }
        /*int ind=0;
        for(int i=0;i<n;i++)
        {
            if(ind==S.length())
            {
                ind=0;
                if(C==0)
                {
                    break;
                }
            }
            if(S.charAt(ind)=='a')
            {
                C++;
            }
            //System.out.println(ind+" ");
            ind++;
        }*/
        return C;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
