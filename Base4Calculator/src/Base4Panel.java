import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base4Panel extends JPanel {
	private Base4CalcState calc; // this object will actually do the calculating work
	JButton zero, 
	one, 
	two, 
	three, 
	plus, 
	minus, 
	multiply, 
	divide, 
	clear;

	Base4Panel() {
		this.setLayout(new FlowLayout()); 
		zero = new JButton("0"); 
		one = new JButton("1");
		two = new JButton("2"); 
		three = new JButton("3"); 
		plus = new JButton("+"); 
		minus = new JButton("-"); 
		multiply = new JButton("x"); 
		divide = new JButton("/"); 
		clear = new JButton("Clear");

		add(plus);
		add(minus);
		add(multiply);
		add(divide);
		add(three);
		add(two);
		add(one);
		add(zero);
		add(clear);

		// do you need any other layout elements? 

		// you may decide you want to improve the appearance of the layout, 
		// which is fine. But defer that until you get the calculator working. 
		// (You can spend HOURS messing with layout, which is not the point of this exercise!)


	}

	// you need to deal with event handling. before you go too crazy writing code, 
	// think about when the calc object needs to be involved, and when it doesn't 

}
