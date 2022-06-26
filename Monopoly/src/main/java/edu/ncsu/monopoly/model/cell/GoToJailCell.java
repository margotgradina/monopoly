package edu.ncsu.monopoly.model.cell;

import edu.ncsu.monopoly.model.users.GameMaster;
import edu.ncsu.monopoly.model.users.Player;

public class GoToJailCell extends Cell {
	
	public GoToJailCell() {
		setName("Go to Jail");
	}

	public boolean playAction() {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		JailCell jail = (JailCell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);
		return true;
	}
}
