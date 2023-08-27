//ITS java task 1

// 1.prompt the user to enter the first number.

// 2.Read and store the first number in a variable of the appropriate data type.

// 3.Prompt the user to enter the second number.

// 4.Read and store the second number in a variable of the appropriate data type.

// 5.Prompt the user to enter the operator(+,-,*,/).

// 6.Read and store the operator in a variable of the appropriate data type.

// 7.Perform the corresponding arithmetic operation based on the operator entered.

 // if the operator is '+',add the two number
 // if the operator is'-',subtract the second number from the first number.
 // if the operator is '*',multiply the two numbers.
 // if the operator is'/',divide the first number by the second number.
 
 // 8.Display the result of the operation to the user.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	JLabel u1,u2,u3;
	FDemo()
	{
		setTitle("SANJAY SONI");
		Font f=new Font("",Font.BOLD,50);
		setFont(f);
		
		setLayout(null);
		
		u1=new JLabel("Enter First Number");
		u1.setBounds(100,100,600,60);
		u1.setFont(f);
		add(u1);
		
		t1=new JTextField(10);
		t1.setBounds(650,100,400,60);
		t1.setFont(f);
		add(t1);
		
		u2=new JLabel("Enter Second Number");
		u2.setBounds(100,200,600,60);
		u2.setFont(f);
		add(u2);
		
		t2=new JTextField(10);
		t2.setBounds(650,200,400,60);
		t2.setFont(f);
		add(t2);
		
		b1=new JButton("+");
		b1.setBounds(100,350,100,60);
		b1.setFont(f);
		add(b1);
		
		b2=new JButton("-");
		b2.setBounds(200,350,100,60);
		b2.setFont(f);
		add(b2);
		
		b3=new JButton("*");
		b3.setBounds(300,350,100,60);
		b3.setFont(f);
		add(b3);
		
		b4=new JButton("/");
		b4.setBounds(400,350,100,60);
		b4.setFont(f);
		add(b4);
		
		u3=new JLabel("Result=");
		u3.setBounds(100,500,500,60);
		u3.setFont(f);
		add(u3);
		
		t3=new JTextField(10);
		t3.setBounds(300,500,400,60);
		t3.setFont(f);
		add(t3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			t3.setText(""+(x+y));
			
		}
		if(e.getSource()==b2)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			t3.setText(""+(x-y));
			
		}
		if(e.getSource()==b3)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			t3.setText(""+(x*y));
			
		}
		if(e.getSource()==b4)
		{
			double x=(double)Integer.parseInt(t1.getText());
			double y=(double)Integer.parseInt(t2.getText());
			String s1=""+(x/y);
			if(s1.length()>5)
				s1=s1.substring(0,6);
			t3.setText(s1)
			;
			
		}
		
	}
	
}
class Calculator
{
	public static void main(String args[])
	{
		FDemo f2=new FDemo();
		f2.setVisible(true);
		f2.setBounds(200,200,1100,800);
		f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
	}
}