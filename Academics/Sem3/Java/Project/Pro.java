import java.awt.*;
import javax.swing.*;
class Pro extends JFrame
{
	public Pro()
	{
		ImageIcon i=new ImageIcon("Z:/eLearning_LoginBanner_LrgBtn.PNG");
		JButton jb=new JButton("MOODLE",i);
		add(jb);
		//setLayout(new FlowLayout());
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jl1=new JLabel(i);
		add(jl1);
		jl1.setBounds(1,1,300,300);
		JCheckBox jc1= new JCheckBox("Linux");
		add(jc1);
		JCheckBox jc2= new JCheckBox("Windows");
		add(jc2);
		JCheckBox jc3= new JCheckBox("Mac");
		add(jc3);
		JRadioButton jr1,jr2,jr3,jr4;
		JLabel jl2=new JLabel("Which Company?      :");
		add(jl2);
		jr1=new JRadioButton("HP");
		add(jr1);
		jr2=new JRadioButton("DELL");
		add(jr2);
		jr3=new JRadioButton("APPLE");
		add(jr3);
		jr4=new JRadioButton("CHROMEBOOK");
		add(jr4);
		ButtonGroup bg=new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		bg.add(jr4);
		JPasswordField jp1=new JPasswordField(10);
		add(jp1);
		JToggleButton jtb1=new JToggleButton("On/Off");
		add(jtb1);
		JLabel jl3=new JLabel("Which Country?      :");
		add(jl3);
		String countries[] = { "France", "Germany", "Italy", "Japan" };
		JComboBox jcb= new JComboBox(countries);
		add(jcb);
		
	}
	
	public static void main(String R[])
	{
		new Pro();
	}
}
//862
