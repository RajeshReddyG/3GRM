import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class SwingApp 
{
	static int count;
	public static void main(String Rajesh[])
	{
		JFrame jf=new JFrame("Rajesh's Swing application");
		jf.setLayout(new FlowLayout());
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l=new JLabel("Swing means powerful GUI");
		jf.add(l);
		JLabel l1=new JLabel("I am trying to master Swing");
		jf.add(l1);
		JButton b1=new JButton("Press Me");
		jf.add(b1);
		final JLabel l2=new JLabel();
		jf.add(l2);
		final JTextField t=new JTextField(10);//width of 10 columns
		jf.add(t);
		t.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent fe)
			{
				count=1;
			}
			public void focusLost(FocusEvent fe)
		{}
		}
			);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				l2.setText(t.getText()+" You pressed me: "+count+++" times");
			}
		}
										);
										
	}
}
