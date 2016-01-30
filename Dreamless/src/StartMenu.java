import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartMenu {

	public static void main(String[] args){
		
		StartMenu startMenu = new StartMenu();
		startMenu.menuFrame();
		
	}
	
	public void menuFrame(){
		
		final JFrame menuFrame = new JFrame("Dreamless");
		menuFrame.setLayout(new BorderLayout());
		
		JPanel menuPanel = new JPanel();
		menuFrame.add(menuPanel, BorderLayout.CENTER);
		menuPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints g = new GridBagConstraints();
		g.anchor = GridBagConstraints.CENTER;
		g.insets = new Insets(15, 50, 0, 20);
		g.fill = GridBagConstraints.VERTICAL;
		
		JButton playButton = new JButton("PLAY");
		g.gridx = 0;
		g.gridy = 0;
		menuPanel.add(playButton, g);
		
		playButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					
				GameMenu gameMenu = new GameMenu();
				gameMenu.menuFrame();
				menuFrame.dispose();
			}
		});
		
		JButton aboutButton = new JButton("ABOUT");
		g.gridy = 1;
		menuPanel.add(aboutButton, g);

		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.setPreferredSize(new Dimension(600, 400));
		menuFrame.setResizable(false);
		menuFrame.pack();
		menuFrame.setLocationRelativeTo(null);
		menuFrame.setBackground(Color.BLACK);
		menuFrame.setVisible(true);		
			
	}
	
}
