import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	Boolean OperatorClicked = false;
	String opera;
	String oldValue;
	JFrame jf;
	JLabel label;
	JButton SevenButton,EightButton,NineButton,FiveButton,FourButton,SixButton,OneButton,TwoButton,ThreeButton,ZeroButton   ;
	JButton AddButton,SubButton,MulButton,DivButton,ClrButton,AnsButton,DotButton ;
	
	
	
	Calculator(){
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.getContentPane().setBackground(Color.DARK_GRAY);
		jf.setSize(320, 480);
		
		jf.setLocation(100, 50);
		
		label = new JLabel();
		label.setBounds(20, 20, 270, 60);
		label.setBackground(Color.lightGray);
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Calibri", Font.BOLD, 35));
		label.setForeground(Color.darkGray);
		jf.add(label);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SevenButton= new JButton("7");
		SevenButton.setBounds(20, 100, 60, 60);
		SevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SevenButton.addActionListener(this);
		SevenButton.setBackground(Color.LIGHT_GRAY);
		jf.add(SevenButton);
		
		EightButton= new JButton("8");
		EightButton.setBounds(90, 100, 60, 60);
		EightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		EightButton.addActionListener(this);
		EightButton.setBackground(Color.LIGHT_GRAY);
		jf.add(EightButton);
		
		NineButton= new JButton("9");
		NineButton.setBounds(160, 100, 60, 60);
		NineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		NineButton.addActionListener(this);
		NineButton.setBackground(Color.LIGHT_GRAY);
		jf.add(NineButton);
		
		
		
		FourButton= new JButton("4");
		FourButton.setBounds(20, 170, 60, 60);
		FourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		FourButton.addActionListener(this);
		FourButton.setBackground(Color.LIGHT_GRAY);
		jf.add(FourButton);
		
		FiveButton= new JButton("5");
		FiveButton.setBounds(90, 170, 60, 60);
		FiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		FiveButton.addActionListener(this);
		FiveButton.setBackground(Color.LIGHT_GRAY);
		jf.add(FiveButton);
		
		SixButton= new JButton("6");
		SixButton.setBounds(160, 170, 60, 60);
		SixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SixButton.addActionListener(this);
		SixButton.setBackground(Color.LIGHT_GRAY);
		jf.add(SixButton);
		
		
		OneButton= new JButton("1");
		OneButton.setBounds(20, 240, 60, 60);
		OneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		OneButton.addActionListener(this);
		OneButton.setBackground(Color.LIGHT_GRAY);
		jf.add(OneButton);
		
		TwoButton= new JButton("2");
		TwoButton.setBounds(90, 240, 60, 60);
		TwoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		TwoButton.addActionListener(this);
		TwoButton.setBackground(Color.LIGHT_GRAY);
		jf.add(TwoButton);
		
		ThreeButton= new JButton("3");
		ThreeButton.setBounds(160, 240, 60, 60);
		ThreeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ThreeButton.addActionListener(this);
		ThreeButton.setBackground(Color.LIGHT_GRAY);
		jf.add(ThreeButton);
		
		AddButton= new JButton("+");
		AddButton.setBounds(230, 100, 60, 60);
		AddButton.setFont(new Font("Arial", Font.PLAIN, 30));
		AddButton.addActionListener(this);
		AddButton.setBackground(Color.LIGHT_GRAY);
		jf.add(AddButton);
		
		
		SubButton= new JButton("-");
		SubButton.setBounds(230, 170, 60, 60);
		SubButton.setFont(new Font("Arial", Font.PLAIN,40));
		SubButton.addActionListener(this);
		SubButton.setBackground(Color.LIGHT_GRAY);
		jf.add(SubButton);
		
		MulButton = new JButton("x");
		MulButton.setBounds(230, 240, 60, 60);
		MulButton.setFont(new Font("Arial", Font.PLAIN,30));
		MulButton.addActionListener(this);
		MulButton.setBackground(Color.LIGHT_GRAY);
		jf.add(MulButton);
		
		DivButton = new JButton("/");
		DivButton.setBounds(20, 310, 60, 60);
		DivButton.setFont(new Font("Arial", Font.PLAIN,30));
		DivButton.addActionListener(this);
		DivButton.setBackground(Color.LIGHT_GRAY);
		jf.add(DivButton);
		
		ZeroButton = new JButton("0");
		ZeroButton.setBounds(90, 310, 60, 60);
		ZeroButton.setFont(new Font("Arial", Font.PLAIN,30));
		ZeroButton.addActionListener(this);
		ZeroButton.setBackground(Color.LIGHT_GRAY);
		jf.add(ZeroButton);
		
		ClrButton = new JButton("Clear");
		ClrButton.setBounds(100, 380, 100, 40);
		ClrButton.setFont(new Font("Arial", Font.PLAIN,15));
		ClrButton.addActionListener(this);
		ClrButton.setBackground(Color.LIGHT_GRAY);
		jf.add(ClrButton);
		
		AnsButton = new JButton("=");
		AnsButton.setBounds(230, 310, 60, 60);
		AnsButton.setFont(new Font("Arial", Font.PLAIN,30));
		AnsButton.addActionListener(this);
		AnsButton.setBackground(Color.LIGHT_GRAY);
		jf.add(AnsButton);
		
		DotButton = new JButton(".");
		DotButton.setBounds(160, 310, 60, 60);
		DotButton.setFont(new Font("Arial", Font.PLAIN,30));
		DotButton.addActionListener(this);
		DotButton.setBackground(Color.LIGHT_GRAY);
		jf.add(DotButton);
		
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==SevenButton) {
			if(OperatorClicked) {
				label.setText("7");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"7");
			}
			
		}else if(e.getSource()==EightButton) {
			if(OperatorClicked) {
				label.setText("8");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"8");
			}
		}else if(e.getSource()==NineButton) {
			if(OperatorClicked) {
				label.setText("9");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"9");
			}
		}else if(e.getSource()==FourButton) {
			if(OperatorClicked) {
				label.setText("4");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"4");
			}
		}else if(e.getSource()==FiveButton) {
			if(OperatorClicked) {
				label.setText("5");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"5");
			}
		}else if(e.getSource()==SixButton) {
			if(OperatorClicked) {
				label.setText("6");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"6");
			}
		}else if(e.getSource()==OneButton) {
			if(OperatorClicked) {
				label.setText("1");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"1");
			}
		}else if(e.getSource()==TwoButton) {
			if(OperatorClicked) {
				label.setText("2");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"2");
			}
		}else if(e.getSource()==ThreeButton) {
			if(OperatorClicked) {
				label.setText("3");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"3");
			}
		}else if(e.getSource()==ZeroButton) {
			if(OperatorClicked) {
				label.setText("0");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+"0");
			}
		}else if(e.getSource()==AddButton) {
			
			OperatorClicked = true;
			oldValue=label.getText();
			opera = "+";
			
		}else if(e.getSource()==SubButton) {
			OperatorClicked = true;
			oldValue=label.getText();
			opera = "-";
			
		}else if(e.getSource()==MulButton) {
			OperatorClicked = true;
			oldValue=label.getText();
			opera = "*";
			
		}else if(e.getSource()==DivButton) {
			OperatorClicked = true;
			oldValue=label.getText();
			opera = "/";
			
		}else if(e.getSource()==DotButton) {
			if(OperatorClicked) {
				label.setText(".");
				OperatorClicked = false;
			}else {
				label.setText(label.getText()+".");
			}
		}else if(e.getSource()==ClrButton) {
			label.setText("");	
		}else if(e.getSource()==AnsButton) {
			
			String newValue=label.getText();
			double NewVal=Double.parseDouble(newValue);
			double Oldval=Double.parseDouble(oldValue);
			
			switch(opera) {
			case "+" : label.setText(Oldval+NewVal+"");
			break;
			case "-" : label.setText(Oldval-NewVal+"");
			break;
			case "*" : label.setText(Oldval*NewVal+"");
			break;
			case "/" : label.setText(Oldval/NewVal+"");
			break;
			
			}
		}
	}
}
