
package edu.ncsu.monopoly.model.gameboard;

import edu.ncsu.monopoly.model.cell.FreeParkingCell;
import edu.ncsu.monopoly.model.cell.GoToJailCell;
import edu.ncsu.monopoly.model.cell.JailCell;

public class GameBoardFreeParking extends GameBoard {
	public GameBoardFreeParking() {
		super();
		JailCell jail = new JailCell();
		FreeParkingCell freeParking = new FreeParkingCell();
		GoToJailCell goToJail = new GoToJailCell();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
