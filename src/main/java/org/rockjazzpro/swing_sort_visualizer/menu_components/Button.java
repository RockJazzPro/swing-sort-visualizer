package org.rockjazzpro.swing_sort_visualizer.menu_components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import org.rockjazzpro.swing_sort_visualizer.Menu;

public class Button extends JButton{
	public Button(String name) {
		super(name);
		setBorderPainted(false);
		setFocusPainted(false);
		setBackground(Color.WHITE);
		setForeground(new Color(30, 39, 46));
		setFont(new Font("Roboto", Font.PLAIN, Menu.fontSize));
	}
}
