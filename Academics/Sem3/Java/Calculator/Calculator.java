import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator
{
	public static int Res;
	public static int a;
	public static int b;
	public static int f;
	public static void main(String Rajesh[])
	{
		final JFrame jf=new JFrame("Rajesh's Calculator application");
		GridLayout gb= new GridLayout(0,3);
		jf.setLayout(gb);
		jf.setSize(450,400);
		jf.setVisible(true);
		//jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l=new JLabel("Give Num in TextFeald:");
		jf.add(l);
		final JTextField t=new JTextField(5);//width of 10 columns
		jf.add(t);
		JButton n1=new JButton("1");
		jf.add(n1);
		JButton n2=new JButton("2");
		jf.add(n2);
		JButton n3=new JButton("3");
		jf.add(n3);
		JButton n4=new JButton("4");
		jf.add(n4);
		JButton n5=new JButton("5");
		jf.add(n5);
		JButton n6=new JButton("6");
		jf.add(n6);
		JButton n7=new JButton("7");
		jf.add(n7);
		JButton n8=new JButton("8");
		jf.add(n8);
		JButton n9=new JButton("9");
		jf.add(n9);
		JButton n0=new JButton("0");
		jf.add(n0);
		JButton s1=new JButton("+");
		jf.add(s1);
		JButton s2=new JButton("-");
		jf.add(s2);
		JButton s3=new JButton("/");
		jf.add(s3);
		JButton s4=new JButton("*");
		jf.add(s4);
		JButton s5=new JButton("=");
		jf.add(s5);
		JButton s6=new JButton("Clear");
		jf.add(s6);
		////////////////////////////////////////////
		
		n1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"1");
			}
		}
													);
		n2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"2");
			}
		}
													);
		n3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"3");
			}
		}
													);
		n4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"4");
			}
		}
													);
		n5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"5");
			}
		}
													);
		
		n6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"6");
			}
		}
													);
		n7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"7");
			}
		}
													);
		n8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"8");
			}
		}
													);
		
		n9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"9");
			}
		}
													);
													
		n0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+"0");
			}
		}
													);
		
		s1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				a=Integer.parseInt(t.getText());
				f=1;
				t.setText("");
			}
		}
													);
		s2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				a=Integer.parseInt(t.getText());
				f=2;
				t.setText("");
			}
		}
													);
		s3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				a=Integer.parseInt(t.getText());
				f=3;
				t.setText("");
			}
		}
													);
		s4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				a=Integer.parseInt(t.getText());
				f=4;
				t.setText("");
			}
		}
													);
												
		s5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				b=Integer.parseInt(t.getText());
				if(f==1)
					t.setText(String.valueOf(a+"+"+b+"="+(a+b)));
				if(f==2)
					t.setText(String.valueOf(a+"-"+b+"="+(a-b)));
				if(f==3)
					t.setText(String.valueOf(a+"/"+b+"="+(a/b)));
				if(f==4)
					t.setText(String.valueOf(a+"*"+b+"="+(a*b)));
			}
		}
													);
	s6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText("");
			}
		}
													);
		
		
													
	}
}
