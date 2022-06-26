package edu.ncsu.monopoly.model.card;

import edu.ncsu.monopoly.model.users.GameMaster;
import edu.ncsu.monopoly.model.users.Player;
import edu.ncsu.monopoly.model.cell.Cell;

public class MovePlayerCard extends Card {
    
    private String destination;

    public MovePlayerCard(String destination, int cardType) {
        super(cardType);
        this.destination = destination;
    }

    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
        Cell currentPosition = currentPlayer.getPosition();
        int newCell = GameMaster.instance().getGameBoard().queryCellIndex(destination);
        int currentCell = GameMaster.instance().getGameBoard().queryCellIndex(currentPosition.getName());
        int diceValue = 0;
        if(currentCell > newCell) {
            diceValue = (GameMaster.instance().getGameBoard().getCellNumber() + 
                    (newCell - currentCell));
        }
        else if(currentCell <= newCell) {
            diceValue = newCell - currentCell;
        }
        System.out.println(diceValue);
        GameMaster.instance().movePlayer(currentPlayer, diceValue);
    }

    public String getLabel() {
        return "Go to " + destination;
    }

}
