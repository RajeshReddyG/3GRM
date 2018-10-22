//Login Credintials 
class Login
{
	public static void main(String args[])
	{
		String u="rajeshg",p="AsdF4321";

		String u1="RajeshG",p1="AsdF4321";

		if(u.compareToIgnoreCase(u1)==0&&p==p1)
			System.out.println("Acess Allowed"+"\nSize of u1:"+u.length());
			
		else
			System.out.println("Acess Denied\nTry Again....");
		
	}
}
			
	
