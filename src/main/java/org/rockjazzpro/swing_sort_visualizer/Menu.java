package org.rockjazzpro.swing_sort_visualizer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.rockjazzpro.swing_sort_visualizer.menu_components.*;

public class Menu extends JPanel{
	
	public static int fontSize;
	
	private final Color BACKGROUND = new Color(46, 204, 113);
	private int width, height;
	private Label title;
	private Button randBtn, startSort;
	
	public Menu(int width, int height) {
		this.width = width; 
		this.height = height;
		
		fontSize = (int) ((float) height/100*5);
		
		setPreferredSize(new Dimension(width, height));
		setLayout(new GridLayout(5, 1, 0, 50));
		setBackground(BACKGROUND);
		
		title = new Label("VIS", JLabel.CENTER);
		randBtn = new Button("Randomize");
		startSort = new Button("Start");
		
		add(title);
		add(randBtn);
		add(startSort);
	}
}
