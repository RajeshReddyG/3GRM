//JTabbedPaneDemo.java
//There are four tabs in tabbed pane
//Tabs: AboutUs, Courses, People, and Feedback
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
class Faculty extends JPanel 
{
	Faculty()
	{
		DefaultMutableTreeNode cse=new DefaultMutableTreeNode("CSE Faculty");
   DefaultMutableTreeNode ece=new DefaultMutableTreeNode("ECE Faculty");
   DefaultMutableTreeNode eee=new DefaultMutableTreeNode("EEE Faculty");
   DefaultMutableTreeNode me=new DefaultMutableTreeNode("ME Faculty");
   DefaultMutableTreeNode admin=new DefaultMutableTreeNode("Admin Staff");
   DefaultMutableTreeNode lab=new DefaultMutableTreeNode("Lab Staff");
   DefaultMutableTreeNode security=new DefaultMutableTreeNode("Security Staff");
   //create root nodes of subtrees
   DefaultMutableTreeNode teaching=new DefaultMutableTreeNode("Teaching Staff");
   DefaultMutableTreeNode nonteaching=new DefaultMutableTreeNode("Non-teaching Staff");
   //add individual nodes to subtrees
   teaching.add(cse);
   teaching.add(ece);
   teaching.add(eee);
   teaching.add(me);
   nonteaching.add(admin);
   nonteaching.add(lab);
   nonteaching.add(security);
   //create root node and add subtrees to it
   DefaultMutableTreeNode principal=new DefaultMutableTreeNode("Principal");
   principal.add(teaching);
   principal.add(nonteaching);
   //create the tree
   JTree jt=new JTree(principal);
   //add tree to scroll pane
   JScrollPane jsp=new JScrollPane(jt);
  //add scroll pane to container
  add(jsp);
}
}
class AboutUs extends JPanel {
     AboutUs(){
 JLabel l=new JLabel("Ours is a premier institute in Southern India");
 add(l);//add label to AboutUs panel
 String[] colHeads = { "RollNumber", "Name", "Marks" };
// Initialize data.
String[][] data = {
{ "501", "Abhilash", "25" },
{ "502", "Aiswarya", "26" },
{ "503", "Akhib", "27" },
{ "504", "Aneesha", "22" },
{ "505", "Anis Nihar", "23" },
{ "506", "Aravind", "24" },
{ "507", "Bindu", "27" },
{ "508", "Bhavana", "24" },
{ "509", "Deepthi", "25" },
{ "510", "Dinesh", "22" }
};
//create table
JTable jtl=new JTable(data,colHeads);
JScrollPane jsp=new JScrollPane(jtl);
add(jsp);
 }
}
class Courses extends JPanel {
    Courses() {
 JLabel l1=new JLabel("B Tech:");
 JLabel l2=new JLabel("M Tech:");
 String[] ug={"CSE","ECE","EEE","ME","CIVIL"};
 String[] pg={"CSE","VLSI","DECS","EPS","SPS","Machine Design"};
 JComboBox jcb1=new JComboBox(ug);
 JComboBox jcb2=new JComboBox(pg);
 //add controls to panel
 add(l1);
 add(jcb1);
 add(l2);
 add(jcb2);
     }
}
class People extends JPanel{
     People(){
		 JPanel jp1=new JPanel();
		 JCheckBox jc1= new JCheckBox("Linux");
		jp1.add(jc1);
		JCheckBox jc2= new JCheckBox("Windows");
		jp1.add(jc2);
		JCheckBox jc3= new JCheckBox("Mac");
		jp1.add(jc3);
               //create a list
               String[] p={"komala","Alexander","Nepolian","Socrates","Bob"};
               JTextArea jta=new JTextArea(5,20);
               jp1.add(jta);
 JScrollPane jl=new JScrollPane (jp1);
              //add list to panel
               add(jl);
     }
}
class Feedback extends JPanel{
    Feedback(){
                JLabel jl=new JLabel("Rating:");
                //create check boxes. Of course, radio buttons are suitable here 
                JCheckBox jcb1=new JCheckBox("One");
                JCheckBox jcb2=new JCheckBox("Two");
                JCheckBox jcb3=new JCheckBox("Three");
                JCheckBox jcb4=new JCheckBox("Four");
                JCheckBox jcb5=new JCheckBox("Five",true);
               //add controls to panel
               add(jl);
 add(jcb1);
 add(jcb2);
 add(jcb3);
 add(jcb4);
 add(jcb5);
      }
}
class JTabbedPaneDemo extends JFrame{
JTabbedPaneDemo()
{
//set properties of frame
super("MITS");
setSize(500,300);
setLayout(new FlowLayout());
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
//Create tabbed pane
JTabbedPane jtp=new JTabbedPane();
//add individual panes to jtp
jtp.addTab("About Us",new AboutUs());
jtp.addTab("Courses",new Courses());
jtp.addTab("OS",new People());
jtp.addTab("Feedback",new Feedback());
jtp.addTab("Faculty",new Faculty());
//add tabbed pane to frame
add(jtp);
}
public static void main(String args[])
{
  new JTabbedPaneDemo();
}
}
