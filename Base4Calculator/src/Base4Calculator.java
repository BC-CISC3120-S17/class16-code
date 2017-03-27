import javax.swing.JFrame;

// this class probably won't need to change much: most of the 'action' is in Base4Panel and Base4Calc


public class Base4Calculator {

	public static void main(String[] args) {
		createAndShowGUI();
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Base 4 Calculator");

		frame.add(new Base4Panel());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
