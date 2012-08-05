import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Spielfeld extends JPanel implements Runnable{
	
	
	
	public Spielfeld(){
		
	}
	
	public void paintComponent(Graphics g){
		zeichneKartenAusschnitt(g);
		zeichneSpieler(g);
		//...und sonstiges
	}
	
	public void zeichneKartenAusschnitt(Graphics g){
		
	}
	public void zeichneSpieler(Graphics g){
		
	}
	public Dimension getPreferredSize(){
		return new Dimension(800,600);		//?
	}

	@Override
	public void run() {
		while(true){
			repaint();
		}
	}
}
