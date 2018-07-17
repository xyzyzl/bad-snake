package components;

import java.awt.*;

public class Tile {

	int x, y;
	Color col;
	boolean passable;
	public Tile(int x, int y, Color col) {
		this.x=x;
		this.y=y;
		this.col=col;
		passable = col != Color.RED;
	}
	public boolean stopGame() {
		return passable;
	}
	
}
