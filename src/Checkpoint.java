import javax.swing.JOptionPane;

public class Checkpoint {
	public static void main(String[] args) {
		String color=JOptionPane.showInputDialog("What's your favorite color");
		JOptionPane.showMessageDialog(null,color + ", that's also my favorite color");
	}

}
