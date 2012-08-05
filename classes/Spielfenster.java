import java.awt.Point;

import javax.swing.JFrame;


public class Spielfenster extends JFrame {

	Steuerung steuerung;
	Spieler spieler;
	
	Point ofView = new Point(0,0);
	
	Gameloop gameloop;
	
	Spielfeld spielfeld;
	
	Thread gameloopthread, zeichenloopthread;
	
	public Spielfenster(){
		super("Project Z");
		
		spielfeld = new Spielfeld();
		
		steuerung = new Steuerung();
		addKeyListener(steuerung);
		
		spieler = new Spieler(10,10);
				
		add(spielfeld);
		
		gameloopthread = new Thread(gameloop);
		zeichenloopthread = new Thread(spielfeld);
		gameloopthread.start();
		zeichenloopthread.start();
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
