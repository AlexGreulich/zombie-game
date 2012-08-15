
public class Spieler extends Entity {

	
	
	public Spieler(int x,int y){
		pos_x = x;
		pos_y = y;
		energy = 100;
	}
	public int getPosx(){
		return pos_x;
	}
	public int getPosy(){
		return pos_y;
	}
}
