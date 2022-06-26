
package edu.ncsu.monopoly.gui.dialog;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;

import edu.ncsu.monopoly.model.users.Player;


public class BuyHouseDialog extends JDialog {
	private JComboBox cboMonopoly;
	private JComboBox cboNumber;

	private Player player;

	public BuyHouseDialog(Player player) {
		this.player = player;
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Select monopoly"));
		c.add(buildMonopolyComboBox());
		c.add(new JLabel("Number of houses"));
		c.add(buildNumberComboBox());
		c.add(buildOKButton());
		c.add(buildCancelButton());
		c.doLayout();
		this.pack();
	}

	private JButton buildCancelButton() {
		JButton btn = new JButton("Cancel");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				cancelClicked();
			}
		});
		return btn;
	}

	private JComboBox buildMonopolyComboBox() {
		cboMonopoly = new JComboBox(player.getMonopolies());
		return cboMonopoly;
	}
	
	private JComboBox buildNumberComboBox() {
		cboNumber = new JComboBox(new Integer[]{
				1,
				2,
				3,
				4,
				5});
		return cboNumber;
	}

	private JButton buildOKButton() {
		JButton btn = new JButton("OK");
		btn.addActionListener(e -> okClicked());
		return btn;
	}
	
	private void cancelClicked() {
		this.dispose();
	}
	
	private void okClicked() {
		String monopoly = (String)cboMonopoly.getSelectedItem();
		int number = cboNumber.getSelectedIndex() + 1;
		player.purchaseHouse(monopoly, number);
		this.dispose();
	}
}
