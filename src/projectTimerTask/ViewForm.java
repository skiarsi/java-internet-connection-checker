package projectTimerTask;

import java.awt.Color;
import java.net.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewForm extends JFrame{
	JLabel label;
	JLabel labelText;
	ViewForm(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Checking Connection");
		this.setSize(350,90);
		
		labelText = new JLabel("Checking Connection ...");
		labelText.setBounds(40, 0, 310, 50);
		this.add(labelText);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBounds(10, 10, 10, 30);
		
		label.setBackground(Color.green);
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				
				try {
					URL url = new URL("https://www.google.com");
					URLConnection connection = url.openConnection();
					connection.connect();
					labelText.setText("Program is Connected");
					label.setBackground(Color.green);
				}catch (Exception e) {
					label.setBackground(Color.red);
					labelText.setText("Program is not Connected");
				}
				
			}
		};
		
		timer.scheduleAtFixedRate(task, 0, 2000);
		
		this.add(label);
		
		this.setVisible(true);
	}
}
