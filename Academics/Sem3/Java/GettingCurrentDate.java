import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GettingCurrentDate 
{
   public static void main(String[] args) 
   {
	   Scanner S=new Scanner(System.in);
		System.out.println("System Time in HH MM :");
       //getting current date and time using Date class
       DateFormat df = new SimpleDateFormat("HH");
       Date dateobj = new Date();
       System.out.println(df.format(dateobj));
       String hh=df.format(dateobj);
       DateFormat mf = new SimpleDateFormat("mm");
       Date dateobjj = new Date();
       System.out.println(mf.format(dateobjj));
       String mm=mf.format(dateobjj);
       System.out.println("Give Time in HH MM :");
		String h=S.next();
		String m=S.next();
       
       if(h.equals(hh)&&m.equals(mm))
			System.out.println("Same Time");
		else
			System.out.println("Not Equal");
			
       
    }
}
