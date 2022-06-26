package edu.ncsu.monopoly.model.cell;

import edu.ncsu.monopoly.model.users.Player;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	public String getName() {
		return name;
	}

	public Player getTheOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}

	 public void setName(String name) {
		this.name = name;
	}

	public void setTheOwner(Player theOwner) {
		this.theOwner = theOwner;
	}
    
    public String toString() {
        return name;
    }
}
