import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class NoiseLevel {

	public static void main(String[] args) {

		NoiseLevel noiseMenu = new NoiseLevel();
		noiseMenu.noiseFrame();

	}

	public void noiseFrame() {

		JFrame noiseFrame = new JFrame("Dreamless");

		JPanel mainPanel = new JPanel();
		noiseFrame.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridBagLayout());

		GridBagConstraints g = new GridBagConstraints();
		g.anchor = GridBagConstraints.CENTER;
		g.insets = new Insets(30, 50, 0, 20);
		g.fill = GridBagConstraints.VERTICAL;

		JTextField inst = new JTextField("Click the noisy stuff!");
		inst.setEditable(false);
		g.gridx = 0;
		g.gridy = 0;
		mainPanel.add(inst, g);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 2));
		g.gridy = 1;
		mainPanel.add(buttonPanel, g);

		ArrayList<String> noises = new ArrayList<String>();
		noises.add("Radiators");
		noises.add("Fan");
		noises.add("Hair dryer");
		noises.add("Waffle");
		noises.add("Towel");
		noises.add("Phone");

		JButton choice1 = new JButton(noises.get(0));
		buttonPanel.add(choice1);
		JButton choice2 = new JButton(noises.get(1));
		buttonPanel.add(choice2);
		JButton choice3 = new JButton(noises.get(2));
		buttonPanel.add(choice3);
		JButton choice4 = new JButton(noises.get(3));
		buttonPanel.add(choice4);
		JButton choice5 = new JButton(noises.get(4));
		buttonPanel.add(choice5);
		JButton choice6 = new JButton(noises.get(5));
		buttonPanel.add(choice6);


		JPanel arrowPanel = new JPanel();
		arrowPanel.setLayout(new BorderLayout());
		g.gridy = 2;
		mainPanel.add(arrowPanel,g);
		
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

		noiseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		noiseFrame.setPreferredSize(new Dimension(600, 400));
		noiseFrame.setResizable(false);
		noiseFrame.pack();
		noiseFrame.setLocationRelativeTo(null);
		noiseFrame.setBackground(Color.BLACK);
		noiseFrame.setVisible(true);

	}
}
