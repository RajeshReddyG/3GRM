//To sort a given list of names in ascending order using Bubble Sort
class StringSort
{
	public static void main(String args[])
	{
		String names[]={"R@jesh","Pavan","Haswanth","Harish","Aravind"};
		String t;
		for(int i=0;i<names.length;i++)
		{
			for(int j=0;j<names.length-1;j++)
			{
				if(names[j].compareTo(names[j+1])>0)
				{
					t=names[j];
					names[j]=names[j+1];
					names[j+1]=t;
				}
			}
		}
//display sorted names
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
	}
}
