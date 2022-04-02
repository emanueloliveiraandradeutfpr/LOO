package com.utfpr.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InitialScreen extends JPanel implements VisualWindow{

	private FrameBase frameb;
	private JButton btOK;
	private JTextField tfRegister;
	private int a = 1;
	

	public InitialScreen(FrameBase frameb) {
		this.frameb = frameb;
		setLayouts();
		setComponents();
		setEvents();
		
		
	}


	@Override
	public void setLayouts() {
		setLayout(new FlowLayout());
		setVisible(true);
		setBackground(Color.GREEN);

	}

	@Override
	public void setComponents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEvents() {
		// TODO Auto-generated method stub

	}

}
