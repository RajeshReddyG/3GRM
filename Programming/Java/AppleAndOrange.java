/*
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the red region denotes his house, where  is the start point, and  is the endpoint. The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .

Apple and orange(2).png

When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  units to the tree's right.

Given the value of  for  apples and  oranges, determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range )?
*
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
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int AC=0,OC=0;
        for(int apple_i=0; apple_i < m; apple_i++)
        {
            apple[apple_i] = in.nextInt();
            if((a+apple[apple_i])>=s&&(a+apple[apple_i])<=t)
            {
                   AC++;
            //System.out.print(AC+"Apples");
            }
             
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++)
        {
            orange[orange_i] = in.nextInt();
            if((b+orange[orange_i])>=s&&(b+orange[orange_i])<=t)
            {
                 OC++;
                //System.out.print(OC+" Oranges");
            }
               
        }
        System.out.print(AC+"\n"+OC);
    }
}

