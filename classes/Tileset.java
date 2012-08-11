import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class Tileset {
	ArrayList<Tile> tiles;
	BufferedImage tileset;
	
	public Tileset(){
		try {
		
			tileset = ImageIO.read(new File("F:\\DerWorkspace\\Zombie\\src\\Tileset.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		tilesetLaden(tileset);
	}
	public void tilesetLaden(BufferedImage set){
		tiles = new ArrayList<Tile>();
		int Anzahl_x = set.getWidth()/32;
		int Anzahl_y = set.getHeight()/32;
		
		for(int x=0;x<Anzahl_x;x++){
			for(int y=0;y<Anzahl_y;y++){
				
				Tile t = new Tile((set.getSubimage(x*32, y*32, 32, 32)));
				/*index 
				 * 0	gras
				 * 1	sand
				 * 2	busch
				 * 3	stein
				 * 4	wasser
				 * */
				tiles.add(t);
				// if zb stein dann istBegehbar=false
			}
		}
	}
	
}
