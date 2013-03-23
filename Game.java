
public class Game {
	private String name;
	private boolean favourite;
	
	public Game (String aName, boolean fav) {
		name = aName;
		favourite = fav;
	}
	
	public Game(String aName) {
		name = aName;
	}
	
	public String getName() { return name; }
	public boolean isFav() { return favourite; }
	
	public void setFav(boolean fav) { favourite = fav; }
	
	public String toString() {
		return name;
	}

}
