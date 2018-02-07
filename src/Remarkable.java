import javax.swing.JOptionPane;

//week one (2.5.18)

public class Remarkable {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter a person's name.");

		if (name.equals("Matt")) {

			JOptionPane.showMessageDialog(null, "Your hobby is Scuba Diving.");

		}

		if (name.equals("Max")) {

			JOptionPane.showMessageDialog(null, "Your hobby is playing dogdeball.");

		}

		if (name.equals("Sheridan")) {

			JOptionPane.showMessageDialog(null, "Your hobby is Archery.");

		}

		if (name.equals("Lucas")) {

			JOptionPane.showMessageDialog(null, "Your hobby is playing Basketball.");

		}

	}

}