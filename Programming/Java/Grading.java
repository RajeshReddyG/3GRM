/*
 * HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .

Given the initial value of  for each of Sam's  students, write code to automate the rounding process.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    static int[] solve(int[] grades)
    {
        int A5[]=new int[13];
        int G[]=new int[grades.length];
        int C=0;
        /*for(int j=40;j<105;j=j+5)
        {
            A5[C]=j;
            //System.out.println(A5[C]);
            C++;
        }*/
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]<38)
            {
                G[i]=grades[i];
            }
            else
            {
                if(grades[i]%5==0)
                    G[i]=grades[i];
                else if((grades[i]+1)%5==0)
                    G[i]=grades[i]+1;
                else if((grades[i]+2)%5==0)
                    G[i]=grades[i]+2;
                else
                    G[i]=grades[i];
            }
        }
        // Complete this function
        return G;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++)
        {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

