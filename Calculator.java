import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{
	JButton button[]=new JButton[16];
	JPanel panel,panel2,panel3; 
	JTextField text,text2;
	BorderLayout border;
	Calculator()
	{
		setTitle("Calculator");
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		border=new BorderLayout(100,100);
		panel2=new JPanel(new GridLayout(4,4));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel(border);
		panel.setBounds(3,4,50,50);
		panel.setBackground(Color.GRAY);
		panel2.setBounds(80,80,100,100);
		panel2.setBackground(Color.yellow);
		add(panel,BorderLayout.NORTH);
		
		panel.add(panel2,BorderLayout.SOUTH);
		for(int i=0;i<16;i++)
		{
			if(i<10)
				button[i]=new JButton(String.valueOf(i));
			else if(i==10)
				button[i]=new JButton("c");
			else if(i==11)
				button[i]=new JButton("+");
			else if(i==12)
				button[i]=new JButton("-");
			else if(i==13)
				button[i]=new JButton("/");
			else if(i==14)
				button[i]=new JButton("*");
			else if(i==15)
				button[i]=new JButton("=");
			
			button[i].setBounds(20,20,40,40);
			button[i].setBackground(Color.GREEN);
			panel2.add(button[i]);
			button[i].addActionListener(this);
		}
		
	}
	public void actionPerformed(ActionEvent e)
	{
//setText("click me");
	}
		
				
			
		
	public static void main(String args[])
	{
		new Calculator();
	}
}