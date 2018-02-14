import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
		int score = 0;
		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

String answer1 = JOptionPane.showInputDialog(null, "What is greater than God, "
		+ "more evil then the Devil, "
		+ "the poor have it, "
		+ "the rich need it, "
		+ "and if you eat it, you die?");
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		if (answer1.equals("nothing")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
		score = score + 1;
			
		}
		
		// 5. Otherwise, say "wrong" and tell them the answer
		
		else {
			
			JOptionPane.showMessageDialog(null, "Wrong. The answer is nothing, because "
					+ "nothing is greater than God, "
					+ "nothing is more evil than the Devil, "
					+ "poor people have nothing, "
					+ "rich people need nothing, "
					+ "and if you eat nothing, you die.");
		}
		
			
		// 6. Add some more riddles

		String answer2 = JOptionPane.showInputDialog(null, "What can travel around the world while "
				+ "staying in a corner?");
		
		if (answer2.equals("a stamp")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
			
		}
		
		else {
		
			JOptionPane.showMessageDialog(null, "Wrong. The answer is a stamp, "
					+ "because it stays in the corner of a postcard.");
			
		}
		
		String answer3 = JOptionPane.showInputDialog(null, "Paul's height is six feet, "
				+ "he's an assistant ata butcher's shop, "
				+ "and wears size 9 shoes. "
				+ "What does he weigh?");
		
		if (answer3.equals("meat")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
		score = score + 1;
			
		}
		
		else {
		
			JOptionPane.showMessageDialog(null, "Wrong. The answer is meat,"
					+ " because he is a butcher and butchers weigh meat.");
			
		}
		
		// 2. Make a pop up to show the score.
		
		JOptionPane.showMessageDialog(null, "Your score was " + score + ".");
		
	}

	private static Object score() {
		// TODO Auto-generated method stub
		return null;
	}
}

