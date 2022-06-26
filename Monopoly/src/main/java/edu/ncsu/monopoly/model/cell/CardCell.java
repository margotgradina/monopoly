package edu.ncsu.monopoly.model.cell;

public class CardCell extends Cell {
    private int type;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public boolean playAction(String msg) {
        return true;
    }
    
    public int getType() {
        return type;
    }
}
