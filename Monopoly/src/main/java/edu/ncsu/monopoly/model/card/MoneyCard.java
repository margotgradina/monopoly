package edu.ncsu.monopoly.model.card;

import edu.ncsu.monopoly.model.users.GameMaster;
import edu.ncsu.monopoly.model.users.Player;

public class MoneyCard extends Card {
    private int amount;
    private String label;
    
    public MoneyCard(String label, int amount, int cardType){
        super(cardType);
        this.label = label;
        this.amount = amount;
    }

    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		currentPlayer.setMoney(currentPlayer.getMoney() + amount);
    }

    public String getLabel() {
        return label;
    }
}
