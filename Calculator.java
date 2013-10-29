package myCalculator.new2code.com;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
		//define the button variables
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn_plus = new JButton("+");
		
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn_minus = new JButton("-");
		
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn_multiply = new JButton("*");
		
		JButton btn0 = new JButton("0");
		JButton btn_clr = new JButton("clr");
		JButton btn_del = new JButton("DEL");
		JButton btn_divide = new JButton("/");
		JButton btn_equals = new JButton("=");
		//new textfiled
		TextField txt=new TextField(15);
		
		String str_number = "";
		int operation = 0;
		double int_number1 =0;
		double int_number2 = 0;
		double result = 0;
		
		public Calculator() {
			JFrame frame = new JFrame("William's Calculator");
			frame.setSize(320, 320);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//always have to create x button to close app
			frame.setResizable(true);//allow user to resize
			frame.setVisible(true);
			
			frame.setLayout(new BorderLayout());
			
			JPanel HeadPanel = new JPanel();
			JPanel NumberPanel = new JPanel();
			JPanel LabelPanel = new JPanel();
			
			LabelPanel.setBackground(Color.BLACK);
			HeadPanel.setBackground(Color.BLUE);
			
			NumberPanel.setLayout(new GridLayout(4,4));
			LabelPanel.setLayout(new FlowLayout());
			
			NumberPanel.add(btn1);
			btn1.addActionListener(this);
			NumberPanel.add(btn2);
			btn2.addActionListener(this);
			NumberPanel.add(btn3);
			btn3.addActionListener(this);
			NumberPanel.add(btn_plus);
			btn_plus.addActionListener(this);
			
			NumberPanel.add(btn4);
			btn4.addActionListener(this);
			NumberPanel.add(btn5);
			btn5.addActionListener(this);
			NumberPanel.add(btn6);
			btn6.addActionListener(this);
			NumberPanel.add(btn_minus);
			btn_minus.addActionListener(this);
			
			NumberPanel.add(btn7);
			btn7.addActionListener(this);
			NumberPanel.add(btn8);
			btn8.addActionListener(this);
			NumberPanel.add(btn9);
			btn9.addActionListener(this);
			NumberPanel.add(btn_multiply);
			btn_multiply.addActionListener(this);
			
			NumberPanel.add(btn0);
			btn0.addActionListener(this);
			NumberPanel.add(btn_clr);
			btn_clr.addActionListener(this);
			NumberPanel.add(btn_del);
			btn_del.addActionListener(this);
			NumberPanel.add(btn_divide);
			btn_divide.addActionListener(this);
			
			LabelPanel.add(new JLabel("Number : "));
			LabelPanel.add(txt);
			LabelPanel.add(btn_equals);
			btn_equals.addActionListener(this);
			
			txt.setEditable(true);
			btn_del.setEnabled(true);//del not working when running
			
			HeadPanel.add(new JLabel("William's Calculator"));
			frame.add(HeadPanel, BorderLayout.NORTH);
			frame.add(NumberPanel, BorderLayout.CENTER);
			frame.add(LabelPanel, BorderLayout.NORTH);
				
			
		};
		
//activate buttons

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			txt.setText("1");
			str_number+=txt.getText();
			txt.setText(str_number);
		}
		else if (e.getSource()==btn2) {
			txt.setText("2");
			str_number+=txt.getText();
			txt.setText(str_number);
		}
		else if (e.getSource()==btn3) {
			txt.setText("3");
			str_number+=txt.getText();
			txt.setText(str_number);
		}
		else if (e.getSource()==btn4) {
			txt.setText("4");
			str_number+=txt.getText();
			txt.setText(str_number);
		}else if (e.getSource()==btn5) {
			txt.setText("5");
			str_number+=txt.getText();
			txt.setText(str_number);
		}else if (e.getSource()==btn6) {
			txt.setText("6");
			str_number+=txt.getText();
			txt.setText(str_number);
		}else if (e.getSource()==btn7) {
			txt.setText("7");
			str_number+=txt.getText();
			txt.setText(str_number);
		}else if (e.getSource()==btn8) {
			txt.setText("8");
			str_number+=txt.getText();
			txt.setText(str_number);
		}else if (e.getSource()==btn9) {
			txt.setText("9");
			str_number+=txt.getText();
			txt.setText(str_number);
		}else if (e.getSource()==btn0) {
			txt.setText("0");
			str_number+=txt.getText();
			txt.setText(str_number);
		}
		else if (e.getSource()==btn_plus) {
			if(operation==0 & str_number!="") {
				int_number1=Integer.parseInt(str_number);
				txt.setText("+");
				str_number+=txt.getText();
				txt.setText(str_number);
				operation=1;
			}
			else {
				 txt.setText(str_number);
			}
		
			}
		else if (e.getSource()==btn_multiply) {
			if(operation==0 & str_number!=""){
				if (operation==0 & str_number!="") {
					int_number1=Integer.parseInt(str_number);
					txt.setText("*");
					str_number+=txt.getText();
					txt.setText(str_number);
					operation=4;
				}
				else {txt.setText(str_number);
				}
			}
		}
		else if (e.getSource()== btn_divide) {
			if (operation==0 & str_number!="") {
				int_number1=Integer.parseInt(str_number);
				txt.setText("/");
				str_number+=txt.getText();
				txt.setText(str_number);
				operation=4;
			}
			else { txt.setText(str_number);}
		}
		else if(e.getSource()==btn_minus) {
	         if(operation==0 & str_number!="") {
	            int_number1=Integer.parseInt(str_number);
	             txt.setText("-");
	             str_number+=txt.getText();
	             txt.setText(str_number);
	             operation=2;
	             }
	             else { txt.setText(str_number); }
	             }
	     else if(e.getSource()==btn_multiply) {
	         if(operation==0 & str_number!="") {
	            int_number1=Integer.parseInt(str_number);
	             txt.setText("*");
	             str_number+=txt.getText();
	             txt.setText(str_number);
	             operation=3;
	             }
	             else { txt.setText(str_number); }
	             }
	     else if(e.getSource()==btn_divide) {
	         if(operation==0 & str_number!="") {
	            int_number1=Integer.parseInt(str_number);
	             txt.setText("/");
	             str_number+=txt.getText();
	             txt.setText(str_number);
	             operation=4;
	             }
	             else { txt.setText(str_number); }
	             }
	     else if(e.getSource()==btn_equals) {
	         if(operation!=0 & str_number!="") {
	             txt.setText("=");
	               str_number+=txt.getText();
	               txt.setText(str_number);
	             switch(operation) {
	             case 1: {
	                    String[] kelime = null;
	                    kelime = str_number.split("\\+");
	                    int_number2=Integer.parseInt(kelime[1].replace("=",""));
	                 result=int_number1+int_number2;
	                 txt.setText(str_number+Double.toString(result));
	                 break;
	             }
	             case 2: {
	                    String[] kelime = null;
	                    kelime = str_number.split("\\-");
	                    int_number2=Integer.parseInt(kelime[1].replace("=",""));
	                 result=int_number1-int_number2;
	                 txt.setText(str_number+Double.toString(result));
	                 break;
	             }
	             case 3: {
	                    String[] kelime = null;
	                    kelime = str_number.split("\\*");
	                    int_number2=Integer.parseInt(kelime[1].replace("=",""));
	                 result=int_number1*int_number2;
	                 txt.setText(str_number+Double.toString(result));
	                 break;
	             }
	             case 4: {
	                    String[] kelime = null;
	                    kelime = str_number.split("\\/");
	                    int_number2=Integer.parseInt(kelime[1].replace("=",""));
	                 result=int_number1/int_number2;
	                 txt.setText(str_number+Double.toString(result));
	                 break;
	             }
	             }
	             btn0.setEnabled(false);
	             btn1.setEnabled(false);
	             btn2.setEnabled(false);
	             btn3.setEnabled(false);
	             btn4.setEnabled(false);
	             btn5.setEnabled(false);
	             btn6.setEnabled(false);
	             btn7.setEnabled(false);
	             btn8.setEnabled(false);
	             btn9.setEnabled(false);
	             btn_plus.setEnabled(false);
	             btn_minus.setEnabled(false);
	             btn_multiply.setEnabled(false);
	             btn_divide.setEnabled(false);
	             btn_equals.setEnabled(false);
	             btn_del.setEnabled(false);
	         }
	         else { txt.setText("ERROR!!!"); }
	     }
	     else if(e.getSource()==btn_clr) {
	         txt.setText("");
	         str_number = "";
	         operation = 0;
	         int_number1 = 0;
	         int_number2 = 0;
	         result = 0;
	         btn0.setEnabled(true);
	        btn1.setEnabled(true);
	        btn2.setEnabled(true);
	        btn3.setEnabled(true);
	        btn4.setEnabled(true);
	        btn5.setEnabled(true);
	        btn6.setEnabled(true);
	        btn7.setEnabled(true);
	        btn8.setEnabled(true);
	        btn9.setEnabled(true);
	        btn_plus.setEnabled(true);
	        btn_minus.setEnabled(true);
	        btn_multiply.setEnabled(true);
	        btn_divide.setEnabled(true);
	        btn_equals.setEnabled(true);
	     }
		//add functionality to delete button*
		/*
	     else if(e.getSource()==btn_del) {
	    	 if(str_number.length() > 0){
	    		return txt.setEditable(true);
	    	 }
	    	*/
	    	 
	         /*
	        // operation = 0;
	        // int_number1 = 0;
	        // int_number2 = 0;
	      //   result = 0;
	         btn0.setEnabled(true);
	        btn1.setEnabled(true);
	        btn2.setEnabled(true);
	        btn3.setEnabled(true);
	        btn4.setEnabled(true);
	        btn5.setEnabled(true);
	        btn6.setEnabled(true);
	        btn7.setEnabled(true);
	        btn8.setEnabled(true);
	        btn9.setEnabled(true);
	        btn_plus.setEnabled(true);
	        btn_minus.setEnabled(true);
	        btn_multiply.setEnabled(true);
	        btn_divide.setEnabled(true);
	        btn_equals.setEnabled(true);
	        */
	     }
	}

