import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;



public class View extends JFrame{
	private JLabel label;
	private JButton inc;
	private JButton dec;
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	public Font font = new Font("Helvetica", Font.BOLD, 20);

	
	//costruttore
	public View(String text) {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		setTitle("Counter");
		Image img = kit.getImage("icon.png");
		setIconImage(img);
		
		setLayout(new BorderLayout());
		setSize(WIDTH, HEIGHT);
		
		JPanel textPanel = new JPanel(new FlowLayout());
		
		this.label = new JLabel("0");
		label.setForeground(Color.WHITE);
		label.setFont(font);
		textPanel.add(label);
		add(textPanel, BorderLayout.CENTER);
		textPanel.setBackground(Color.BLACK);
		textPanel.repaint();
		
		this.inc = new JButton("+");
		this.dec = new JButton("-");
		
		inc.setActionCommand("increase");
		dec.setActionCommand("decrease");
		
		JPanel southPanel = new JPanel(new FlowLayout());
		southPanel.add(inc);
		southPanel.add(dec);
		add(southPanel, BorderLayout.SOUTH);
		
		southPanel.setBackground(Color.black);
		southPanel.repaint();
	}
	
	public JButton getButtonInc() {
		return inc;
	}
	
	public JButton getButtonDec() {
		return dec;
	}
	
	public void setText(String text) {
		label.setText(text);
	}
	
	

}
