//https://www.hackerrank.com/contests/bz-mits-happy-coding/challenges/rtc-bus-ticket-chillar-problem
import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        int T=S.nextInt();
        int N=S.nextInt();
        int D[]=new int[N];
        for(int i=0;i<N;i++)
        {
            D[i]=S.nextInt();
        }
        Arrays.sort(D);
        for(int i=0;i<N;i++)
        {
            if(T==0)
            {
                System.out.println("YES");
                break;
            }
            T=T-D[i];
            if(T==0)
            {
                System.out.println("YES");
                break;
            }
            else if(T<0)
            {
                System.out.println("NO");
                break;
            }
        }
        if(T>0)
        {
            System.out.println("NO");
        }
    }
}
