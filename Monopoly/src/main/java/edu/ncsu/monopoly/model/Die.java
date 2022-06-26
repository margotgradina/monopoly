package edu.ncsu.monopoly.model;

public class Die {
	public int getRoll() {
		return (int)(Math.random() * 6) + 1;
	}
}
