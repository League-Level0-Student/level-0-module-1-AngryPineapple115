import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MyAges {

	public static void main(String[] args) {

		for (int i = 2006; i <= 2018; i++) {

			System.out.println(i);

			JOptionPane.showMessageDialog(null, "In " + i + " I was " + "" + (i - 2006) + " years old");

		}
	}

}
