package com.utfpr.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class SecondScreen extends JPanel implements VisualWindow{


		private FrameBase frameb;

		public SecondScreen(FrameBase frameb) {
			this.frameb = frameb;
			setLayouts();
			setComponents();
			setEvents();
		}


		@Override
		public void setLayouts() {
			setLayout(new FlowLayout());
			setVisible(true);
			setBackground(Color.BLUE);

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
