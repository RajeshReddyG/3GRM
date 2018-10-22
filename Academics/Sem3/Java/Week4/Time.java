import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time
{
   public static void main(String[] args) 
   {
	   Scanner S=new Scanner(System.in);
		System.out.println("System Time in HH MM :");
		
		//System.out.println(mf.format(dateobjj));
       DateFormat df = new SimpleDateFormat("HH");
       Date dateobj = new Date();
       String hh=df.format(dateobj);
       System.out.println(df.format(dateobj));
       int hi=Integer.parseInt(hh);//Sys time
       
       
       DateFormat mf = new SimpleDateFormat("mm");
       Date dateobjj = new Date();
       String mm=mf.format(dateobjj);
       System.out.println(mf.format(dateobjj));
       int mi=Integer.parseInt(mm);//Sys time
       
       System.out.println("Give Time in HH MM :");
		int h=S.nextInt();
		int m=S.nextInt();
		int h2=S.nextInt();
		int m2=S.nextInt();
		
		if(hi>=h&&h<=h2&&mi>=m&&m<=m2)
			System.out.println("With in The Interval");
			
		
		
       
       /*if(h.equals(hh)&&m.equals(mm))
			System.out.println("Same Time");
		else
			System.out.println("Not Equal");*/
			
       
    }
}

