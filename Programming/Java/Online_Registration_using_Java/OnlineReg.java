import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class OnlineReg extends JFrame
{
	public static int a;
	public static int b,ph,x=0;
	public OnlineReg()
	{
		setSize(2000,2000);
		setLayout(null);
		setVisible(true);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon i1=new ImageIcon("E:/DataBase/W2.PNG");
		JLabel li1=new JLabel(i1);
		ImageIcon i2=new ImageIcon("E:/DataBase/Ra.PNG");
		JLabel li2=new JLabel(i2);
		JLabel l1=new JLabel("Registration For CSED Domain Mail");
		l1.setForeground(Color.red);
        l1.setFont(new Font("Serif", Font.ITALIC, 30));
		JLabel l2=new JLabel("Name with SURNAME:");l2.setForeground(Color.red);
		l2.setFont(new Font("Serif", Font.ITALIC, 25));
		JLabel l3=new JLabel("RollNo@csed.ac.in  :");l3.setForeground(Color.red);
		l3.setFont(new Font("Serif", Font.ITALIC, 25));
		JLabel l4=new JLabel("Create Password  :");l4.setForeground(Color.red);
		l4.setFont(new Font("Serif", Font.ITALIC, 25));
		JLabel l5=new JLabel("Confirm Password:");l5.setForeground(Color.red);
		l5.setFont(new Font("Serif", Font.ITALIC, 25));
		JLabel l6=new JLabel("Date Of Birth  :");l6.setForeground(Color.red);
		l6.setFont(new Font("Serif", Font.ITALIC, 25));
		JLabel l7=new JLabel("Phone Number  :");l7.setForeground(Color.red);
		l7.setFont(new Font("Serif", Font.ITALIC, 25));
		final JTextField t1=new JTextField(20);			
		final JTextField t2=new JTextField(20);				
		JPasswordField t3=new JPasswordField(20);
		JPasswordField t4=new JPasswordField(20);
		JTextField t5=new JTextField(20);
		JTextField t6=new JTextField(20);
		JTextField t7=new JTextField(20);
		JButton b1=new JButton("Submit&Register");
		JButton b2=new JButton("Reset");
		JButton b3=new JButton("Admin Login");
		
		JCheckBox jc=new JCheckBox("Show");
		
		
		/////////////////
		
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
		add(li1);add(li2);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);add(t7);
		add(b1);add(b2);add(b3);
		add(jc);
		
		///////////////////////
		l1.setBounds(300,5,500,35);
		l2.setBounds(150,115,250,30);
		l3.setBounds(150,165,250,30);
		l4.setBounds(150,215,200,30);
		l5.setBounds(150,265,200,30);
		l6.setBounds(150,315,200,30);
		l7.setBounds(150,365,200,30);
		
		li1.setBounds(1,1,1100,500);
		li2.setBounds(1150,590,200,120);
		
		t1.setBounds(460,115,200,30);
		t2.setBounds(460,165,200,30);
		t3.setBounds(460,215,200,30);jc.setBounds(700,215,70,30);
		t4.setBounds(460,265,200,30);
		t5.setBounds(460,315,200,30);
		t6.setBounds(460,365,200,30);
		//t7.setBounds(150,235,200,30);
		b1.setBounds(250,440,150,30);
		b2.setBounds(500,440,100,30);
		//b3.setBounds(500,600,150,30);
		
		///////////////////////////////////
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals(""))
					JOptionPane.showMessageDialog(t3, "All Fealds Are Must Be FILLED");
				else
				{
					String na=t1.getText();
					String em=t2.getText();
					String p1=t3.getText();
					String p2=t4.getText();
					String db=t5.getText();
					int f1=0;
					try
					{
						ph=Integer.parseInt(t6.getText());
					}
					catch(Exception e)
					{
						f1=-1;
						
					}
					t1.setText(p1);
					if(!p1.equals(p2))
					{
						JOptionPane.showMessageDialog(t3, "Password Not MATCHED");
					}
					if(f1==-1)
					{
						JOptionPane.showMessageDialog(t3, "Please Provide NUMERIC Ph.Num");
					}
					if(!em.endsWith("csed.ac.in"))
					{
						JOptionPane.showMessageDialog(t3, "Email Must End with @csed.ac.in");
					}
					//else if(ph.isInteger());
					else
					{
						//Connect To DATABASE
						try
						{
							Connection con = DriverManager.getConnection("jdbc:ucanaccess://Oreg.accdb");
							//Statement s = con. createStatement(); // Create Statement
							//String query = "INSERT INTO Student(SName,Email,Password,Dob,PNo) VALUES (na,em,p1,db,ph);"; // Create Query
							//PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?,?)");
							//s.execute(query); // Execute Query 
							//ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
							PreparedStatement ps = con.prepareStatement("insert into Det(UName,EMail,Pswd,Dob,PNo)values(?,?,?,?,?)");
							ps.setString(1, na);
							ps.setString(2, em);
							ps.setString(3, p1);
							ps.setString(4, db);
							ps.setString(5, String.valueOf(ph));
							//ps.setString(6, String.valueOf(ph));
							ps.executeUpdate();
							JOptionPane.showMessageDialog(t3, "Sucessfully Registered...!!!");
							ResultSet rs = ps.getResultSet();
								
							
							}
 
						catch (Exception e) 
 
						{
 
								System.out.println("Exception...! : "+e);
 
						}
						//JOptionPane.showMessageDialog(t3, "Sucessfully Registered...!!!");
					}
				}
			}
		});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t1.setText("");t2.setText("");t3.setText("");
				t4.setText("");t5.setText("");t6.setText("");
				JOptionPane.showMessageDialog(t3, "Resetted");
			}
		});
		jc.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(jc.isSelected())
					t3.setEchoChar((char)0);
				else
					t3.setEchoChar('*');
			}
		});
	}
		public static void main(String[] args)
		{
			new OnlineReg();
		}
}

