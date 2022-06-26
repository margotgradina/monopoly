package edu.ncsu.monopoly.model.card;

public interface ICard {
    String getLabel();

    void applyAction();

    int getCardType();
}
