import javax.swing.JFrame;

public class Tester {
	
	public static void main(String[] args){
		Model model = new Model();
		View view = new View(Integer.toString(model.getX()));
		Controller controller = new Controller(model, view);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);
		}

}
