import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Level {
	
	/*
	 * Die level- klasse hat ein int [][], in dem die tile- IDs gespeichert sind. 
	 * die IDs ergeben sich ja aus der Pixelfarbe, also muss eine methode her die die
	 * farben ausliest und entsprechend eine zahl in das array speichert. 
	 * in der spielfeldklasse kann dann je nach position geguckt werden welche id drin steht 
	 * und damit dann der ausschnitt gezeichnet werden.
	 * */
	
	BufferedImage karte;
	int[][] tileIDs;
	Color grass = new Color(100,200,100);
		Color sand = new Color(255,255,0);
		Color busch = new Color(0,200,0);
		Color stein = new Color(100,100,100);
		Color wasser = new Color(0,255,255);
		
	public Level(){
		
		
		
		
		
	}
	public int getID(int x, int y){
		return tileIDs[x][y];
		
	}
	
	public void karteAuslesen(){
		for(int x = 0;x<karte.getWidth();x++){
			for(int y = 0;y<karte.getHeight();y++){
				Color c = new Color(karte.getRGB(x,y));
				if(c == grass){
					tileIDs[x][y]=0;
				}else if(c == sand){
					tileIDs[x][y]=1;
				}else if(c == busch){
					tileIDs[x][y]=2;
				}else if(c == stein){
					tileIDs[x][y]=3;
				}else if(c == wasser){
					tileIDs[x][y]=4;
				}
			}
		}
	}
	public void karteLaden(File file) {
		try{
			karte = ImageIO.read(file);
		}catch(IOException e){
			e.printStackTrace();
		}
		tileIDs = new int[karte.getWidth()][karte.getHeight()];
	}
}
