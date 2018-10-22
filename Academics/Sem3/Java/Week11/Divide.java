import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Divide extends JFrame
{
	public static int a;
	public static int b;
	public Divide()
	{
		setSize(430,170);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l= new JLabel("Division App");
		add(l);
		//l.setBounds(111,111,111,111);
		final JTextField t1=new JTextField(10);
		add(t1);
		final JTextField t2=new JTextField(10);
		add(t2);
		JButton b1=new JButton("Divide");
		add(b1);
		JLabel l1= new JLabel("Result:");
		add(l1);
		final JTextField t3=new JTextField(10);
		add(t3);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try{
						a=Integer.parseInt(t1.getText());
						b=Integer.parseInt(t2.getText());
						t3.setText(String.valueOf(a+"/"+b+"="+(a/b)));
					}
				catch(Exception e)
				{	
					t3.setText(String.valueOf(e));
				}
		}
		});
	}
	public static void main(String[] args)
	{
		new Divide();
	}
}
