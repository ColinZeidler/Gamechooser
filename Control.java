import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Control extends JFrame{
	private static Control frame;
	private View view;
	
	
	public Control(String title) {
		super(title);
		view = new View();
		
		add(view);
		setSize(200, 150);
		
		view.getGetButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {handleGetGame();}});
	}
	
	protected void handleGetGame() {
		System.out.println("Get game clicked!");
		
	}

	public static void main(String[] args) {
		frame = new Control("What to Play");
		frame.setVisible(true);

	}

}
