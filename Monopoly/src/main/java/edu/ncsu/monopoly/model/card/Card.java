package edu.ncsu.monopoly.model.card;

public abstract class Card implements ICard {

    public static int TYPE_CHANCE = 1;
    public static int TYPE_CC = 2;
    int type;

    protected Card(int cardType) {
        type = cardType;
    }

    @Override
    public int getCardType() {
        return type;
    }
}
