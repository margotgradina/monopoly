package edu.ncsu.monopoly.mock;

import edu.ncsu.monopoly.gui.dialog.RespondDialog;
import edu.ncsu.monopoly.model.TradeDeal;

public class MockRespondDialog implements RespondDialog {
    public MockRespondDialog(TradeDeal deal) {
    }

    public boolean getResponse() {
        return true;
    }
}
