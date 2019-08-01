package com.project2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ServerMain extends JFrame implements ActionListener{

	public ServerMain() {
		
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("SirenOrder - Server");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new ServerMain();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
