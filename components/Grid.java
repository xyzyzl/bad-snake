package components;

public class Grid {

	Tile[][] gd;
	boolean[][] vis;
	
	public Grid(int i, int j) {
		gd = new Tile[i][j];
		vis = new boolean[i][j];
	}
	
	
}
