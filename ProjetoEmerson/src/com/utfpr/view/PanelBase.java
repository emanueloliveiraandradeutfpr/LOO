package com.utfpr.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class PanelBase extends JPanel implements VisualWindow{

	private FrameBase frameB;
	private InitialScreen initialJP;
	private SecondScreen secondJP;

	public PanelBase(FrameBase frameB) {
		this.frameB = frameB;
		setLayouts();
		setComponents();
		setEvents();


	}


	@Override
	public void setLayouts() {
		setLayout(new CardLayout());
		setBackground(Color.MAGENTA);
		setVisible(true);

	}

	@Override
	public void setComponents() {
		initialJP = new InitialScreen(frameB);
		secondJP = new SecondScreen(frameB);
		// adicionando as telas nesta tela-base (cardLayout)
		add(initialJP, "initial");
		add(secondJP, "second");
	}

	@Override
	public void setEvents() {
		// TODO Auto-generated method stub

	}

}
