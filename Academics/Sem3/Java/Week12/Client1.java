//Client-side application
import java.io.*;
import java.net.*;
class Client1
{
public static void main(String args[]) throws Exception{
//create a  socket with some port number
Socket s=new Socket("localhost",124);
InputStream is=s.getInputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(is));
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);
String str;
while(true)
{
while(!(str=br.readLine()).equals("quit"))
{
System.out.println("From Server:"+str);
String str1=br1.readLine();//keyboard
ps.println(str1);
}
ps.println("quit");
System.exit(0);
br.close();
br1.close();
s.close();
}
}
}
