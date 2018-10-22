//Server-side application
import java.io.*;
import java.net.*;
class Server1
{
public static void main(String args[]) throws Exception{
  //create a server socket with some port number
  ServerSocket ss=new ServerSocket(124);
  Socket s=ss.accept();
  System.out.println("Connection Established");
  InputStream is=s.getInputStream();
  BufferedReader br=new BufferedReader(new InputStreamReader(is));
  OutputStream os=s.getOutputStream();
  BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
  PrintStream ps=new PrintStream(os);
  String str1,str2;
  while(true)
  {
    ps.println("Hello!");
   while(!(str1=br.readLine()).equals("quit"))
   {
    System.out.println("From Rajesh:"+str1);
    str2=br1.readLine();
    ps.println(str2);
   }
   ps.println("quit");
   System.exit(0);
 ps.close();
 ss.close();
 s.close();
}
}
}
