package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
	private JPanel contentPane;
	
	public Menu(){
		super("Menu Principal");
		setBounds(100,50,270,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		
	}
}
