//ArrayList To array.
import java.util.*;
class ArToAL
{
	public static void main(String args[]) 
	{
		ArrayList <Integer> AL = new ArrayList <Integer>();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(4);
		System.out.println("Contents of ArrayList: " + AL);
		Integer A[] = new Integer[AL.size()];
		AL.toArray(A);
		System.out.println("Contents of Array Are: ");
		for(int i:A)
			System.out.println(i);
	}
}
