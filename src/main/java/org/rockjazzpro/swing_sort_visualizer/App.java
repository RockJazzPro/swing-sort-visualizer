package org.rockjazzpro.swing_sort_visualizer;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class App extends JFrame{
	
	private Menu control;
	private SortGraphics vis;
	private final int WIDTH, HEIGHT;
	
	public App() {
		super("swing-sort-visualizer");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		WIDTH = ((int) tk.getScreenSize().getWidth());
		HEIGHT = ((int) tk.getScreenSize().getHeight());
		
		setLayout(new BorderLayout());
		
		control = new Menu((int) Math.round(WIDTH * 0.20), HEIGHT);
		vis = new SortGraphics((int) Math.round(WIDTH * 0.80), HEIGHT);
		
		add(vis, BorderLayout.CENTER);
		add(control, BorderLayout.EAST);
		
		
		getRootPane().registerKeyboardAction(e -> {
		    dispose();
		}, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	
	public static void main(String[] args) {
		App frame = new App();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
}
