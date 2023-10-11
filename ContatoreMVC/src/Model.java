
public class Model {
	
	private int x;
	
	//costruttore valore iniziale nullo
	public Model() {
		x = 0;
	}
	
	//costrittore valore iniziale x
	public Model(int x) {
		this.x = x;
	}
	
	public void incX() {
		x++;
	}
	public void decX() {
		x--;
	}
	
	public int getX() {
		return x;
	}
	
}
