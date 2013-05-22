import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class View extends JPanel {
	private JButton getGame, save, load;
	private JList<String> gameList;
	private JLabel gameListLabel;
	private Model model;

	public View(Model m) {
		model = m;
		// layout stuff
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5); // default spacing
		setLayout(layout);

		// buttons
		getGame = new JButton("Pick a Game");
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 0;
		constraints.weighty = 0;
		layout.setConstraints(getGame, constraints);
		add(getGame);
		
		save = new JButton("Save");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 0;
		constraints.weighty = 0;
		layout.setConstraints(save, constraints);
		add(save);
		
		load = new JButton("Load");
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 0;
		constraints.weighty = 0;
		layout.setConstraints(load, constraints);
		add(load);

		// List
		gameList = new JList<String>();
		JScrollPane scroll = new JScrollPane(gameList);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 3;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = 1;
		layout.setConstraints(scroll, constraints);
		add(scroll);

		update();
	}

	public JButton getGetButton() {
		return getGame;
	}

	public JButton getSaveButton() {
		return save;
	}
	
	public JButton getLoadButton() {
		return load;
	}
	public void update() {
		String[] gameArray = new String[model.getGames().size()];
		for (int i = 0; i < gameArray.length; i++) {
			gameArray[i] = model.getGames().get(i).toString();
		}
		gameList.setListData(gameArray);
	}


}
