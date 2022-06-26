package edu.ncsu.monopoly.model.card;

public abstract class Card {

    public static int TYPE_CHANCE = 1;
    public static int TYPE_CC = 2;
    int type;

    public Card(int cardType) {
        type = cardType;
    }

    public abstract String getLabel();
    public abstract void applyAction();

    public int getCardType() {
        return type;
    }
}
