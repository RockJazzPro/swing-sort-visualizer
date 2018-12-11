package org.rockjazzpro.swing_sort_visualizer;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SortGraphics extends JPanel{
	private final Color BACKGROUND = new Color(30, 39, 46);
	
	public SortGraphics(int width, int height) {
		setBackground(BACKGROUND);
		setPreferredSize(new Dimension(width, height));
	}
}
