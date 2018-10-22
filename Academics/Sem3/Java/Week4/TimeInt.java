//time interval
import java.util.*;
class TimeInt
{
	public static void main (String ars[])
	{
		int t1,t2,t3,t4,tp,tn;
		Calendar c=Calendar.getInstance();
		int th=c.get(Calendar.HOUR);
		int tm=c.get(Calendar.MINUTE);
		int t=th*60+tm;
		System.out.println(t);
		Scanner sc=new Scanner(System.in);
		String time1,time2;
		System.out.println("enter t1 and t2");
		time1=sc.nextLine();
		time2=sc.nextLine();
		StringTokenizer st1=new StringTokenizer(time1,":");
		StringTokenizer st2=new StringTokenizer(time2,":");
		while((st1.hasMoreTokens())&&(st2.hasMoreTokens()))
		{
			t1=Integer.parseInt(st1.nextToken());
			t2=Integer.parseInt(st1.nextToken());
			tp=t1*60+t2;
			t3=Integer.parseInt(st2.nextToken());
			t4=Integer.parseInt(st2.nextToken());
			tn=t3*60+t4;
			if((t>=tp)&&(t<=tn))
			System.out.println("yes");
			else
			System.out.println("no");
		}
	}
}
			
