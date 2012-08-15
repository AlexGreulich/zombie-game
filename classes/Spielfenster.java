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
		spieler = new Spieler(3,3);
		spielfeld = new Spielfeld(this);
		
		steuerung = new Steuerung();
		addKeyListener(steuerung);
		
		
				
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
