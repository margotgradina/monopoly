package edu.ncsu.monopoly.model.cell;

public class FreeParkingCell extends Cell {

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public boolean playAction(String msg) {
		return true;
	}
}
