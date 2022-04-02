package com.utfpr.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class FrameBase extends JFrame implements VisualWindow {

	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem item1, item2;
	public CardLayout cl;

	private PanelBase baseJP;

	public FrameBase() {
		setLayouts();
		setComponents();
		setEvents();
		repaintAll();
	}

	@Override
	public void setLayouts() {
		setSize(800, 600);
		setVisible(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void setComponents() {
		menubar = new JMenuBar();
		menu = new JMenu("Opções");
		item1 = new JMenuItem("opção 1");
		item2 = new JMenuItem("opção 2");

		menu.add(item1);
		menu.add(item2);
		menubar.add(menu);

		baseJP = new PanelBase(this);
		cl = new CardLayout();
		cl = (CardLayout) baseJP.getLayout();

		add(menubar, BorderLayout.NORTH);
		add(baseJP, BorderLayout.CENTER);

	}

	@Override
	public void setEvents() {
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(baseJP, "initial");
				System.out.println("initial");
				repaintAll();

			}
		});
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(baseJP, "second");
				System.out.println("second");
			}
		});

	}
	private void repaintAll() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				repaint();

			}
		});
	}

}
