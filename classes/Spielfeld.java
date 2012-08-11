import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JPanel;


public class Spielfeld extends JPanel implements Runnable{
	
	Tileset tileset;
	
	Spieler spieler;
	Spielfenster fenster;
	Level level;
	BufferedImage map;
	
	public Spielfeld(Spielfenster window){
		tileset = new Tileset();
		fenster = window;
		spieler = fenster.spieler;
		//Point ausschnitt =new Point(spieler.pos_x,spieler.pos_y);
		
		level = new Level();
		File file =new File("F:\\DerWorkspace\\Zombie\\src\\dieerstekarte.png");
		level.karteLaden(file);
		level.karteAuslesen();
	}
	
	public void paintComponent(Graphics g){
		zeichneKartenAusschnitt(g);
		zeichneSpieler(g);
		//...und sonstiges
	}
	
	public void zeichneKartenAusschnitt(Graphics g){
		//fenster.ofView
		int ausschnitt_x = fenster.ofView.x;
		int ausschnitt_y = fenster.ofView.y;
		
		for(int x = ausschnitt_x; x < ausschnitt_x + 32;x++){					/*level.karte.getWidth()*/			/*spieler.pos_y-10;x < spieler.pos_x +10*/
			for(int y = ausschnitt_y; y < ausschnitt_y + 32;y++){					/*level.karte.getHeight()	*/		/*spieler.pos_x -10;y < spieler.pos_y +10*/
				int id = level.getID(x, y);
				g.drawImage(tileset.tiles.get(id).getImage(),x*32,y*32,null );
			//System.out.println("tileID: "+ level.getID(x, y));	
			}
			
		}
		
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
