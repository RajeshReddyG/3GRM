//To Display Banner
import java.awt.*;
import java.applet.*;
public class SimpleBanner extends Applet implements Runnable
{
	String msg=("Hello R@jesh...Welcome to APPLET World___");
	Thread t=null;
	int s;
	boolean SF;
	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.red);
	}
	public void start()
	{
		t=new Thread(this);
		SF=false;
		t.start();
	}
	
	public void run()
	{
		char ch;
		for(;;)
		{try
			{
				repaint();
				Thread.sleep(200);
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch;
				if(SF)
					break;
			}
			catch(Exception e)
			{
			}
		}
	}
	public void stop()
	{
		SF=true;
		t=null;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,30);
		showStatus("R@jesh's Banner");
	}
}
		
/*
 * <applet code="SimpleBanner" width=300 height=300>
 * </applet>
 */
