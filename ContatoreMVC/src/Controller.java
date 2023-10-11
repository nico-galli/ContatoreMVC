import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	
	private final Model model;
	private final View view;
	
	// costruttore
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		setListeners();
	}
	
	public void setListeners() {
		view.getButtonInc().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.incX();
				view.setText(Integer.toString(model.getX()));
				
			}
		});
		
		view.getButtonDec().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.decX();
				view.setText(Integer.toString(model.getX()));
				
			}
		});
	}
	
	
	
}
