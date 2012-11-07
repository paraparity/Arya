package arya;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Input;
import org.newdawn.slick.tiled.TiledMap;

/**
 * The main game program
 * 
 * @author Bryan Young
 * @version 0.01, 6 November 2012
 */
public class AryaMain extends BasicGame {

	Image land = null;
	
	public AryaMain() {
		super("Project Arya");
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	public static void main (String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new AryaMain());
		app.setDisplayMode(640, 480, false);
		app.start();
	}
}