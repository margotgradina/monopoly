package edu.ncsu.monopoly.mock;

import edu.ncsu.monopoly.model.users.GameMaster;
import edu.ncsu.monopoly.model.TradeDeal;
import edu.ncsu.monopoly.gui.dialog.TradeDialog;

public class MockTradeDialog implements TradeDialog {

    public TradeDeal getTradeDeal() {
        TradeDeal deal = new TradeDeal();
        deal.setAmount(200);
        deal.setSellerIndex(0);
        deal.setPropertyName(GameMaster.instance().getGameBoard().getCell(1).toString());
        return deal;
    }
}
