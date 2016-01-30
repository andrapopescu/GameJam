import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScentLevel {

	public static void main(String[] args) {
		ScentLevel scentMenu = new ScentLevel();
		scentMenu.scentFrame();
	}

	public void scentFrame() {
		JFrame scentFrame = new JFrame("Dreamless");

		JPanel mainPanel = new JPanel();
		scentFrame.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridBagLayout());

		// grid bag code
		GridBagConstraints g = new GridBagConstraints();
		g.anchor = GridBagConstraints.CENTER;
		g.insets = new Insets(30, 50, 0, 20);
		g.fill = GridBagConstraints.VERTICAL;
		// positioning

		JLabel inst = new JLabel("Create a nice scent!");
		g.gridx = 0;
		g.gridy = 0;
		mainPanel.add(inst, g);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 2));
		g.gridy = 1;
		mainPanel.add(buttonPanel, g);

		ArrayList<String> scents = new ArrayList<String>();
		scents.add("Vanilla");
		scents.add("Lavander");
		scents.add("Cinammon");
		scents.add("Bacon");
		scents.add("Pancake");
		scents.add("Coffee");
		scents.add("Orange");


		JButton choice1 = new JButton(scents.get(0));
		buttonPanel.add(choice1);
		JButton choice2 = new JButton(scents.get(1));
		buttonPanel.add(choice2);
		JButton choice3 = new JButton(scents.get(2));
		buttonPanel.add(choice3);
		JButton choice4 = new JButton(scents.get(3));
		buttonPanel.add(choice4);
		JButton choice5 = new JButton(scents.get(4));
		buttonPanel.add(choice5);
		JButton choice6 = new JButton(scents.get(5));
		buttonPanel.add(choice6);
		JButton choice7 = new JButton(scents.get(5));
		buttonPanel.add(choice7);
		JButton choice8 = new JButton(scents.get(5));
		buttonPanel.add(choice8);

		JPanel arrowPanel = new JPanel();
		arrowPanel.setLayout(new BorderLayout());
		g.gridy = 2;
		mainPanel.add(arrowPanel, g);

		JButton arrowLeft = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("arrowleft.png"));
			arrowLeft.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		arrowPanel.add(arrowLeft, BorderLayout.WEST);

		JButton arrowRight = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("arrowright.png"));
			arrowRight.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		arrowPanel.add(arrowRight, BorderLayout.EAST);

		scentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scentFrame.setPreferredSize(new Dimension(600, 400));
		scentFrame.setResizable(false);
		scentFrame.pack();
		scentFrame.setLocationRelativeTo(null);
		scentFrame.setBackground(Color.BLACK);
		scentFrame.setVisible(true);
	}
}
