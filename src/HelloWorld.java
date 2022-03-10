
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloWorld implements Constants {

	public static void main(String[] args) {

		JFrame frame = new JFrame(HELLO_WORLD_JAVA_SWING);

		// set frame site
		// Fix #1 : Il faudrait changer la taille de la fenetre
		frame.setMinimumSize(new Dimension(150, 180));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// center the JLabel
		JLabel lblText = new JLabel(HELLO_WORLD, SwingConstants.CENTER);
		Color yellow = new Color(240, 200, 20);
		lblText.setOpaque(true);
		lblText.setBackground(yellow);

		// add JLabel to JFrame
		frame.getContentPane().add(lblText);

		// display it
		frame.pack();
		frame.setVisible(true);

	}
}
