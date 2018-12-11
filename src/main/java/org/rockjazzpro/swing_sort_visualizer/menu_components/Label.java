package org.rockjazzpro.swing_sort_visualizer.menu_components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import org.rockjazzpro.swing_sort_visualizer.Menu;

public class Label extends JLabel{
	public Label(String title, int position) {
		super(title, position);
		setForeground(Color.WHITE);
		setFont(new Font("Roboto", Font.PLAIN, Menu.fontSize));
	}
}
