import java.util.*;
class TTable
{
	void CAge()
	{
		Calendar c=Calendar.getInstance();
		int ph=c.get(Calendar.HOUR);
		int pdw=c.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n\t\t\t   Digital Time Table Of CSE-D");
		System.out.println("\t\t\t=================================");
		System.out.println("\n*****************************************************************************\n");
		switch(pdw)
		{
			case 1:
				System.out.println("Today is Sunday....!!!");
				System.out.println("Now it is Holiday.....Enjoyy....!!!\n");
				break;
			case 2:
				System.out.println("Today is Monday....!!!");
				switch(ph)
				{
					case 9:
						System.out.println("The Class going on is OOP LAB....!!!");
						break;
					case 10:
						System.out.println("The Class going on is OOP LAB....!!!");
						break;
					case 11:
						System.out.println("The Class going on is OOP LAB....!!!");
						break;
					case 0:
						System.out.println("Lunch Break...\nNow It's Time To Have Lunch......!!!");
						break;
					case 1:
						System.out.println("The Class going on is DELT....!!!");
						break;
					case 2:
						System.out.println("The Class going on is OOP....!!!");
						break;
					case 3:
						System.out.println("The Class going on is LIBRARY....!!!");
						break;
					default:
						System.out.println("Now Its Free Time......\nCollege Timings: 9Am to 4pm....!!!");
						break;
				}
				break;
			case 3:
				System.out.println("Today is Tuesday....!!!");
				switch(ph)
				{
					case 9:
						System.out.println("The Class going on is MFCS ....!!!");
						break;
					case 10:
						System.out.println("The Class going on is DELT....!!!");
						break;
					case 11:
						System.out.println("The Class going on is DD....!!!");
						break;
					case 12:
						System.out.println("Lunch Break...\nNow It's Time To Have Lunch......!!!");
						break;
					case 0:
						System.out.println("The Class going on is AC....!!!");
						break;
					case 2:
						System.out.println("The Class going on is POE....!!!");
						break;
					case 3:
						System.out.println("The Class going on is OOP....!!!");
						break;
					default:
						System.out.println("Now Its Free Time......\nCollege Timings: 9Am to 4pm....!!!");
						break;
				}
				break;
			case 4:
				System.out.println("Today is Wednsday....!!!");
				switch(ph)
				{
					case 9:
						System.out.println("The Class going on is DD....!!!");
						break;
					case 10:
						System.out.println("The Class going on is MFCS....!!!");
						break;
					case 11:
						System.out.println("The Class going on is SEMINAR....!!!");
						break;
					case 12:
						System.out.println("Lunch Break...\nNow It's Time To Have Lunch......!!!");
						break;
					case 0:
						System.out.println("The Class going on is OOP....!!!");
						break;
					case 2:
						System.out.println("The Class going on is DSA....!!!");
						break;
					case 3:
						System.out.println("The Class going on is POE....!!!");
						break;
					default:
						System.out.println("Now Its Free Time......\nCollege Timings: 9Am to 4pm....!!!");
						break;
				}
				break;
			case 5:
				System.out.println("Today is Thursday....!!!");
				switch(ph)
				{
					case 9:
						System.out.println("The Class going on is OOP ....!!!");
						break;
					case 10:
						System.out.println("The Class going on is DELT....!!!");
						break;
					case 11:
						System.out.println("The Class going on is APPTITUDE....!!!");
						break;
					case 12:
						System.out.println("Lunch Break...\nNow It's Time To Have Lunch......!!!");
						break;
					case 0:
						System.out.println("The Class going on is AC....!!!");
						break;
					case 2:
						System.out.println("The Class going on is MFCS....!!!");
						break;
					case 3:
						System.out.println("The Class going on is DSA....!!!");
						break;
					default:
						System.out.println("Now Its Free Time......\nCollege Timings: 9Am to 4pm....!!!");
						break;
				}
				break;
			case 6:
				System.out.println("Today is Friday....!!!");
				switch(ph)
				{
					case 9:
						System.out.println("The Class going on is DSA....!!!");
						break;
					case 10:
						System.out.println("The Class going on is POE....!!!");
						break;
					case 11:
						System.out.println("The Class going on is DD....!!!");
						break;
					case 12:
						System.out.println("Lunch Break...\nNow It's Time To Have Lunch......!!!");
						break;
					case 0:
						System.out.println("The Class going on is DSA LAB....!!!");
						break;
					case 2:
						System.out.println("The Class going on is DSA LAB....!!!");
						break;
					case 3:
						System.out.println("The Class going on is DSA LAB....!!!");
						break;
					default:
						System.out.println("Now Its Free Time......\nCollege Timings: 9Am to 4pm....!!!");
						break;
				}
				break;
			case 7:
				System.out.println("Today is Saturday....!!!");
				switch(ph)
				{
					case 9:
						System.out.println("The Class going on is POE....!!!");
						break;
					case 10:
						System.out.println("The Class going on is DSA....!!!");
						break;
					case 11:
						System.out.println("The Class going on is DD*....!!!");
						break;
					case 12:
						System.out.println("Lunch Break...\nNow It's Time To Have Lunch......!!!");
						break;
					case 0:
						System.out.println("The Class going on is MFCS*....!!!");
						break;
					case 2:
						System.out.println("The Class going on is DELT....!!!");
						break;
					case 3:
						System.out.println("         SPORTS....\nIts Time To PLAY......!!!");
						break;
					default:
						System.out.println("Now Its Free Time......\nCollege Timings: 9Am to 4pm....!!!");
						break;
				}
				break;
		}
	System.out.println("\n*****************************************************************************\n");
	}
}
class DigTTable
{
	public static void main(String Yeswanth[])
	{
		TTable a=new TTable();
		a.CAge();
	}
}
		

