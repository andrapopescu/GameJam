import java.awt.*;
import javax.swing.*;

public class GameMenu {

	/*public static void main(String[] args){
		
		GameMenu gameMenu = new GameMenu();
		gameMenu.menuFrame();
		
	}*/
	
	public void menuFrame() {

		JFrame menuFrame = new JFrame("Dreamless");
		menuFrame.setLayout(new BorderLayout());

		JPanel menuPanel = new JPanel();
		menuFrame.add(menuPanel, BorderLayout.CENTER);
		menuPanel.setLayout(new GridBagLayout());

		GridBagConstraints g = new GridBagConstraints();
		g.anchor = GridBagConstraints.CENTER;
		g.insets = new Insets(30, 50, 0, 20);
		g.fill = GridBagConstraints.VERTICAL;

		JButton choice1 = new JButton("Milky way");
		g.gridx = 0;
		g.gridy = 0;
		menuPanel.add(choice1, g);

		JButton choice2 = new JButton("Count the sheeps");
		g.gridy = 1;
		menuPanel.add(choice2, g);

		JButton choice3 = new JButton("Smells");
		g.gridy = 2;
		menuPanel.add(choice3, g);
		
		JButton choice4 = new JButton("Get toasty");
		g.gridy = 3;
		menuPanel.add(choice4, g);
		
		JButton choice5 = new JButton("Noise");
		g.gridy = 4;
		menuPanel.add(choice5, g);
		
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.setPreferredSize(new Dimension(600, 400));
		menuFrame.setResizable(false);
		menuFrame.pack();
		menuFrame.setLocationRelativeTo(null);
		menuFrame.setBackground(Color.BLACK);
		menuFrame.setVisible(true);

	}

}