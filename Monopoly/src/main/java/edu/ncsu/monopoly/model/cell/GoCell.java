package edu.ncsu.monopoly.model.cell;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction(String msg) {
		return true;
	}

	@Override
	public void setName(String name) {
	}
}
