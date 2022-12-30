package brickbraker;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		JFrame obj = new JFrame();
		gameplay gameplay = new gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Breakout ball");
		obj.setVisible(true);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		obj.add(gameplay);
	}

}
