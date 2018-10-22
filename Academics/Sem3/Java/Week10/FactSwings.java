import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FactSwings
{
	static int count=1;
	public static void main(String Rajesh[])
	{
		final JFrame jf=new JFrame("Rajesh's Factorial application");
		jf.setLayout(new FlowLayout());
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l=new JLabel("Give Num in TextFeald:");
		jf.add(l);
		
		final JTextField t=new JTextField(10);//width of 10 columns
		jf.add(t);
		JButton b1=new JButton("Press Me to get FACTORIAL");
		jf.add(b1);
		final JTextField t1=new JTextField(10);//width of 10 columns
		jf.add(t1);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				count=1;
				int n=Integer.parseInt(t.getText());
				for(int i=n;i>0;i--)
					count=count*i;
				
				//l2.setText("Factorial:"+count);
	
				t1.setText(String.valueOf(count));
				t1.setVisible(true);
			}
		}
										);
		
		//final JTextField t1=new JTextField(10);//width of 10 columns
		//jf.add(t1);
		//t1.setText(count);
										
	}
}

