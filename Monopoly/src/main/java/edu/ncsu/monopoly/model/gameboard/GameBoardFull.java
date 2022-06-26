package edu.ncsu.monopoly.model.gameboard;

import edu.ncsu.monopoly.model.card.Card;
import edu.ncsu.monopoly.model.card.JailCard;
import edu.ncsu.monopoly.model.card.MoneyCard;
import edu.ncsu.monopoly.model.card.MovePlayerCard;
import edu.ncsu.monopoly.model.cell.*;

public class GameBoardFull extends GameBoard {
    public GameBoardFull() {
        super();
        PropertyCell dp1 = new PropertyCell();
        CardCell cc1 = new CardCell(Card.TYPE_CC, "Community Chest 1");
        PropertyCell dp2 = new PropertyCell();
        PropertyCell dp3 = new PropertyCell();
        RailRoadCell rr1 = new RailRoadCell();
        PropertyCell lb1 = new PropertyCell();
        CardCell c1 = new CardCell(Card.TYPE_CHANCE, "Chance 1");
        PropertyCell lb2 = new PropertyCell();
        PropertyCell lb3 = new PropertyCell();
        JailCell jail = new JailCell();
        PropertyCell p1 = new PropertyCell();
        UtilityCell u1 = new UtilityCell();
        PropertyCell p2 = new PropertyCell();
        PropertyCell p3 = new PropertyCell();
        RailRoadCell rr2 = new RailRoadCell();
        PropertyCell o1 = new PropertyCell();
        CardCell cc2 = new CardCell(Card.TYPE_CC, "Community Chest 2");
        PropertyCell o2 = new PropertyCell();
        PropertyCell o3 = new PropertyCell();
        FreeParkingCell fp = new FreeParkingCell();
        PropertyCell r1 = new PropertyCell();
        CardCell c2 = new CardCell(Card.TYPE_CHANCE, "Chance 2");
        PropertyCell r2 = new PropertyCell();
        PropertyCell r3 = new PropertyCell();
        RailRoadCell rr3 = new RailRoadCell();
        PropertyCell y1 = new PropertyCell();
        PropertyCell y2 = new PropertyCell();
        UtilityCell u2 = new UtilityCell();
        PropertyCell y3 = new PropertyCell();
        GoToJailCell goToJail = new GoToJailCell();
        PropertyCell g1 = new PropertyCell();
        PropertyCell g2 = new PropertyCell();
        CardCell cc3 = new CardCell(Card.TYPE_CC, "Community Chest 3");
        PropertyCell g3 = new PropertyCell();
        RailRoadCell rr4 = new RailRoadCell();
        CardCell c3 = new CardCell(Card.TYPE_CHANCE, "Chance 3");
        PropertyCell db1 = new PropertyCell();
        PropertyCell db2 = new PropertyCell();
        PropertyCell db3 = new PropertyCell();

        setPropertyCellValues(dp1, 60,"purple", 50, "Mediterranean Avenue", 2);
        setPropertyCellValues(dp2, 60,"purple", 50, "Baltic Avenue", 4);
        setPropertyCellValues(dp3, 60,"purple", 50, "Sarah Avenue", 4);
        setPropertyCellValues(lb1, 100, "aqua", 50, "Oriental Avenue", 6);
        setPropertyCellValues(lb2, 100, "aqua", 50, "Vermont Avenue", 6);
        setPropertyCellValues(lb3, 100, "aqua", 50, "Connecticut Avenue", 8);
        setPropertyCellValues(p1, 140, "fuchsia", 100, "St. Charles Place", 10);
        setPropertyCellValues(p2, 140, "fuchsia", 100, "States Avenue", 10);
        setPropertyCellValues(p3, 140, "fuchsia", 100, "Virginia Avenue", 12);
        setPropertyCellValues(o1, 180, "maroon", 100, "St. James Avenue", 14);
        setPropertyCellValues(o2, 180, "maroon", 100, "Tennessee Avenue", 14);
        setPropertyCellValues(o3, 200, "maroon", 100, "New York Avenue", 16);
        setPropertyCellValues(r1, 220, "red", 150, "Kentucky Avenue", 18);
        setPropertyCellValues(r2, 220, "red", 150, "Indiana Avenue", 18);
        setPropertyCellValues(r3, 240, "red", 150, "Illinois Avenue", 20);
        setPropertyCellValues(y1, 260, "yellow", 150, "Atlantic Avenue", 22);
        setPropertyCellValues(y2, 260, "yellow", 150, "Ventnor Avenue", 22);
        setPropertyCellValues(y3, 280, "yellow", 150, "Marvin Gardens", 24);
        setPropertyCellValues(g1, 300, "green", 200, "Pacific Avenue", 26);
        setPropertyCellValues(g2, 300, "green", 200, "North Carolina Avenue", 26);
        setPropertyCellValues(g3, 300, "green", 200, "Pennsylvania Avenue", 28);
        setPropertyCellValues(db1, 350, "blue", 200, "Park Place", 35);
        setPropertyCellValues(db2, 350, "blue", 200, "Dright Place", 35);
        setPropertyCellValues(db3, 400, "blue", 200, "Boardwalk", 50);

        
        RailRoadCell.setBaseRent(50);
        RailRoadCell.setPrice(200);
        
        rr1.setName("Reading Railroad");
        rr2.setName("Pennsylvania Railroad");
        rr3.setName("B. & O. RailRoad");
        rr4.setName("Short Line");
        
        UtilityCell.setPrice(150);
        
        u1.setName("Electric Company");
        u2.setName("Water Works");
        
        addCell(dp1);
        addCell(cc1);
        addCell(dp2);
        addCell(dp3);
        addCell(rr1);
        addCell(lb1);
        addCell(c1);
        addCell(lb2);
        addCell(lb3);
        addCell(jail);
        addCell(p1);
        addCell(u1);
        addCell(p2);
        addCell(p3);
        addCell(rr2);
        addCell(o1);
        addCell(cc2);
        addCell(o2);
        addCell(o3);
        addCell(fp);
        addCell(r1);
        addCell(c2);
        addCell(r2);
        addCell(r3);
        addCell(rr3);
        addCell(y1);
        addCell(y2);
        addCell(u2);
        addCell(y3);
        addCell(goToJail);
        addCell(g1);
        addCell(g2);
        addCell(cc3);
        addCell(g3);
        addCell(rr4);
        addCell(c3);
        addCell(db1);
        addCell(db2);
        addCell(db3);
        
        addCard(new MoneyCard("Win $50", 50, Card.TYPE_CC));
        addCard(new MoneyCard("Win $20", 20, Card.TYPE_CC));
        addCard(new MoneyCard("Win $10", 10, Card.TYPE_CC));
        addCard(new MoneyCard("Lose $100", -100, Card.TYPE_CC));
        addCard(new MoneyCard("Lose $50", -50, Card.TYPE_CC));
        addCard(new JailCard(Card.TYPE_CC));
        addCard(new MovePlayerCard("St. Charles Place", Card.TYPE_CC));
        addCard(new MovePlayerCard("Boardwalk", Card.TYPE_CC));

        addCard(new MoneyCard("Win $50", 50, Card.TYPE_CHANCE));
        addCard(new MoneyCard("Win $20", 20, Card.TYPE_CHANCE));
        addCard(new MoneyCard("Win $10", 10, Card.TYPE_CHANCE));
        addCard(new MoneyCard("Lose $100", -100, Card.TYPE_CHANCE));
        addCard(new MoneyCard("Lose $50", -50, Card.TYPE_CHANCE));
        addCard(new JailCard(Card.TYPE_CHANCE));
        addCard(new MovePlayerCard("Illinois Avenue", Card.TYPE_CHANCE));
    }

    public void setPropertyCellValues(PropertyCell propertyCell, int price, String colourgroup, int housePrice, String name, int rent){
        propertyCell.setColorGroup(colourgroup);
        propertyCell.setPrice(price);
        propertyCell.setHousePrice(housePrice);
        propertyCell.setName(name);
        propertyCell.setRent(rent);
    }
}
