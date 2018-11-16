/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    static String timeConversion(String s) 
    {
        String S1="",S2;
        //System.out.println(s.substring(0,2));
        if((s.substring(0,2).equals("12"))&&(s.charAt(8)=='A'))
        {
            S1=S1+"00"+s.substring(2,8);
            return S1;
            /*if(s.equals("12:00:00AM"))
            {
                return "00:00:00";
            }*/
        }
        else if((s.substring(0,2).equals("12"))&&(s.charAt(8)=='P'))
        {
            return s.substring(0,8);   
            /*if(s.equals("12:00:00PM"))
            {
                return "12:00:00";
            }*/
        }
        
        else if(s.endsWith("PM"))
        {
            S2=String.valueOf(12+Integer.parseInt(s.substring(0,2)));
            S1=S1+S2+s.substring(2,8);
            //System.out.println(S1);
            return S1;
        }
        else
        {
            return s.substring(0,8);
        }
        
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
