import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Stack;
class Calculator2017
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
		jf.setSize(550,450);
		jf.setVisible(true);
		jf.setResizable(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JToggleButton jtbn = new JToggleButton("On/Off");
		jf.add(jtbn);


		JLabel l=new JLabel("Give Num in TextFeald:");
		jf.add(l);
		final JTextField t=new JTextField(5);
		jf.add(t);
		/////////////////////////////////////////
		JButton n0=new JButton("0");
		jf.add(n0);
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
				t.setText(t.getText()+" + ");
			}
		}
													);
		s2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+" - ");
			}
		}
													);
		s3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+" / ");
			}
		}
													);
		s4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				t.setText(t.getText()+" * ");
			}
		}
													);
												
		s5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
					t.setText(String.valueOf(EvalString.evaluate(t.getText())));
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
		
		
jtbn.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent ie) {
if(jtbn.isSelected())
{
	n0.setVisible(true);
	n1.setVisible(true);
	n2.setVisible(true);
	n3.setVisible(true);
	n4.setVisible(true);
	n5.setVisible(true);
	n6.setVisible(true);n8.setVisible(true);
	n7.setVisible(true);n9.setVisible(true);s1.setVisible(true);s2.setVisible(true);s3.setVisible(true);
	s4.setVisible(true);s5.setVisible(true);s6.setVisible(true);l.setVisible(true);t.setVisible(true);
}
else
{
	n0.setVisible(false);
	n1.setVisible(false);
	n2.setVisible(false);
	n3.setVisible(false);
	n4.setVisible(false);
	n5.setVisible(false);
	n6.setVisible(false);n8.setVisible(false);
	n7.setVisible(false);n9.setVisible(false);s1.setVisible(false);s2.setVisible(false);s3.setVisible(false);
	s4.setVisible(false);s5.setVisible(false);s6.setVisible(false);l.setVisible(false);t.setVisible(false);
	}
}
});
n0.setVisible(false);
	n1.setVisible(false);
	n2.setVisible(false);
	n3.setVisible(false);
	n4.setVisible(false);
	n5.setVisible(false);
	n6.setVisible(false);n8.setVisible(false);
	n7.setVisible(false);n9.setVisible(false);s1.setVisible(false);s2.setVisible(false);s3.setVisible(false);
	s4.setVisible(false);s5.setVisible(false);s6.setVisible(false);l.setVisible(false);t.setVisible(false);

													
	}
}


//////////////////////////////////////////////////////////////////////////////
///////////Class For Evaluating EXPRESSION////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

class EvalString
{
	public static int evaluate(String expression)
	{
		char[] tokens = expression.toCharArray();

		// Stack for numbers: 'values'
		Stack<Integer> values = new Stack<Integer>();

		// Stack for Operators: 'ops'
		Stack<Character> ops = new Stack<Character>();

		for (int i = 0; i < tokens.length; i++)
		{
			// Current token is a whitespace, skip it
			if (tokens[i] == ' ')
				continue;

			// Current token is a number, push it to stack for numbers
			if (tokens[i] >= '0' && tokens[i] <= '9')
			{
				StringBuffer sbuf = new StringBuffer();
				// There may be more than one digits in number
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				values.push(Integer.parseInt(sbuf.toString()));
			}

			// Current token is an opening brace, push it to 'ops'
			else if (tokens[i] == '(')
				ops.push(tokens[i]);

			// Closing brace encountered, solve entire brace
			else if (tokens[i] == ')')
			{
				while (ops.peek() != '(')
				values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				ops.pop();
			}

			// Current token is an operator.
			else if (tokens[i] == '+' || tokens[i] == '-' ||
					tokens[i] == '*' || tokens[i] == '/')
			{
				// While top of 'ops' has same or greater precedence to current
				// token, which is an operator. Apply operator on top of 'ops'
				// to top two elements in values stack
				while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
				values.push(applyOp(ops.pop(), values.pop(), values.pop()));

				// Push current token to 'ops'.
				ops.push(tokens[i]);
			}
		}

		// Entire expression has been parsed at this point, apply remaining
		// ops to remaining values
		while (!ops.empty())
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));

		// Top of 'values' contains result, return it
		return values.pop();
	}

	// Returns true if 'op2' has higher or same precedence as 'op1',
	// otherwise returns false.
	public static boolean hasPrecedence(char op1, char op2)
	{
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	// A utility method to apply an operator 'op' on operands 'a' 
	// and 'b'. Return the result.
	public static int applyOp(char op, int b, int a)
	{
		switch (op)
		{
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new
				UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}
}

