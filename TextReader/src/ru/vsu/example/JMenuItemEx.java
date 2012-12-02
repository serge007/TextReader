package ru.vsu.example;

import javax.swing.JMenuItem;

public class JMenuItemEx extends JMenuItem {
	private int id;
	public JMenuItemEx(int id, String title) {
		super(title);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
