package edu.ncsu.monopoly.model.card;

import edu.ncsu.monopoly.model.users.GameMaster;
import edu.ncsu.monopoly.model.users.Player;
import edu.ncsu.monopoly.model.cell.JailCell;

public class JailCard extends Card {

    public JailCard(int cardType) {
        super(cardType);
    }

    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		JailCell jail = (JailCell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);
    }

    public String getLabel() {
        return "Go to Jail immediately without collecting" +
        		" $200 when passing the GO cell";
    }
}
