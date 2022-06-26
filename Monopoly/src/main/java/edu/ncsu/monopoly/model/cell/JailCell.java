package edu.ncsu.monopoly.model.cell;

public class JailCell extends Cell {
	public static int BAIL = 50;
	
	public JailCell() {
		setName("Jail");
	}
	
	public boolean playAction() {
		return true;
	}
}
