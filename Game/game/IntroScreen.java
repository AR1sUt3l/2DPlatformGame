package game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IntroScreen extends JFrame
{
	private JPanel mainPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel middlePanel = new JPanel();
	
	private JLabel welcomeLabel;
	private JLabel nameLabel;
	private JTextField enterName;
	private JButton instructionsButton;
	private JButton settingsButton;
	
	public IntroScreen()
	{
		intialFrame();
		intialUI();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	private void intialFrame()
	{
		setTitle("RPG Platformer");
		setPreferredSize(new Dimension(900, 600));
	}
	
	private void intialUI()
	{
		mainPanel.setLayout(new BorderLayout());
		addTopPanel();
		addMiddlePanel();
		add(mainPanel);
	}
	
	private void addTopPanel()
	{
		welcomeLabel = new JLabel("Hello!\nWelcome to RPG Platformer!");
		welcomeLabel.setFont(new Font(Font.SERIF, Font.BOLD, 50));
		topPanel.add(welcomeLabel);
		mainPanel.add(topPanel, BorderLayout.NORTH);
	}
	
	private void addMiddlePanel()
	{
		nameLabel = new JLabel("Player Name: ");
		nameLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		enterName = new JTextField(15);
//		enterName.setPreferredSize(new Dimension(20,20));
		middlePanel.add(nameLabel);
		middlePanel.add(enterName);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLocation(200, 200);
	}
	
	public static void main(String[] args)
	{
		new IntroScreen();
	}
}
