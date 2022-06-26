package edu.ncsu.monopoly.model.cell;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction() {
		return true;
	}
	
	public void setName(String name) {
	}
}
