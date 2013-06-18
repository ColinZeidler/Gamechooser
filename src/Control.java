import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Control extends JFrame{
	private static final long serialVersionUID = 1L;
	private static Control frame;
	private View view;
	private Model model;
	
	
	public Control(String title) {
		super(title);
		model = new Model();
		view = new View(model);
		getContentPane().setPreferredSize(view.getPreferredSize());
		pack();		
		add(view);
		
		view.getGetButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {handleGetGame();}});
		
		view.getSaveButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {handleSave();}});
		
		view.getLoadButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {handleLoad();}});
	}
	
	protected void handleLoad() {
		model.loadList();
		
	}

	protected void handleSave() {
		model.saveList();
		
	}

	protected void handleGetGame() {
		model.randomGame(false);
		System.out.println(model.getGameToPlay());
		view.update();
	}

	public static void main(String[] args) {
		frame = new Control("What to Play");
		frame.setVisible(true);

	}

}
