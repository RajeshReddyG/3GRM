import java.awt.*;
import javax.swing.*;
class SwingDEmo extends JFrame
{
	public SwingDEmo()
	{
		ImageIcon i=new ImageIcon("Z:/eLearning_LoginBanner_LrgBtn.PNG");
		JButton jb=new JButton("MOODLE",i);
		add(jb);
		setLayout(new FlowLayout());
		setSize(350,600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jl1=new JLabel("Which OS?      :");
		add(jl1);
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

	}
	public static void main(String R[])
	{
		new SwingDEmo();
	}
}
//862
