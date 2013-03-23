import java.util.ArrayList;


public class Model {
	private ArrayList<Game> gamesList;
	public Model() {
		gamesList = new ArrayList<Game>();
		
		//Test Code
		Game test = new Game("SimCity", false);
		addGame(test);
		addGame(new Game("Team Fortress 2", false));
		addGame(new Game("Far Cry 3", false));
		addGame(new Game("Kerbal Space Program", false));
		addGame(new Game("SimCity 4", false));
		addGame(new Game("Bastion", false));
		addGame(new Game("Empire: Total War", false));
		addGame(new Game("Napoleon: Total War", false));
		addGame(new Game("Total War: Shogun 2", false));
		addGame(new Game("PlanetSide 2", false));
		addGame(new Game("Battle Field 3", false));
		addGame(new Game("Dirt 2", false));
		addGame(new Game("Dirt 3", false));
		addGame(new Game("Prison Architect", false));
		addGame(new Game("War Thunder", false));
		addGame(new Game("Dead Space", false));
		addGame(new Game("Crysis 2", false));
		addGame(new Game("Minecraft", false));
		
	}
	
	public ArrayList<Game> getGames() { return gamesList; }
	
	public void addGame(Game g) {
		System.out.println(g);
		gamesList.add(g);
	}

}
