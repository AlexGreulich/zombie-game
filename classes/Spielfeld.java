import java.awt.Color;
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
		int ausschnitt_ende_x = ausschnitt_x+20,ausschnitt_ende_y = ausschnitt_y+20;
		
		for(int x = ausschnitt_x, rx =0;x < ausschnitt_ende_x;x++,rx++){					/*level.karte.getWidth()*/			/*ausschnitt_x; x < ausschnitt_x + 320*/
			for(int y = ausschnitt_y, ry =0;y < ausschnitt_ende_x;y++,ry++){					/*level.karte.getHeight()	*/		/*ausschnitt_y; y < ausschnitt_y + 320*/
				int id = level.getID(x,y);
				BufferedImage pic = tileset.tiles.get(id).getImage();
				g.drawImage(pic,rx*32,ry*32,null );
				
			//System.out.println("tileID: "+ level.getID(x, y));
			//System.out.println("x,y: "+ x +", "+ y);
			//System.out.println("ausschnitt_x,y: "+ ausschnitt_x +", "+ ausschnitt_y);
			}
			
		}
		
	}
	public void zeichneSpieler(Graphics g){
		//g.setColor(Color.WHITE);
		for(int x =0; x < level.tileIDs.length;x++){					/*level.karte.getWidth()*/			/*spieler.pos_y-10;x < spieler.pos_x +10*/
			for(int y =0; y < level.tileIDs.length;y++){		
				System.out.println(level.getID(x,y));
			}
		}
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
