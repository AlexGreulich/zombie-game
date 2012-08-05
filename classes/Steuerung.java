import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Steuerung implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				 
			case KeyEvent.VK_DOWN:
			
			case KeyEvent.VK_LEFT:
			
			case KeyEvent.VK_RIGHT:
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
			
			case KeyEvent.VK_DOWN:
			
			case KeyEvent.VK_LEFT:
			
			case KeyEvent.VK_RIGHT:
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//für einmaliges drücken zb inventar
	}

	
}
