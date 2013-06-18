import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Model {
	private ArrayList<Game> gamesList;
	private String saveLocation = "gamelist.dat";
	private Game gameToPlay;
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
	
	public void favGame(Game g) {
		for (Game game: gamesList) {
			if (game.equals(g)) {
				g.setFav(true);
				break;
			}
		}
	}
	
	public ArrayList<Game> getFavList() {
		ArrayList<Game> favList = new ArrayList<Game>();
		for (Game game: gamesList) {
			if (game.isFav()) {
				favList.add(game);
			}
		}
		return favList;
	}
	
	public void loadList() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(saveLocation));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void saveList() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(saveLocation));
			for (Game game: gamesList) {
				out.writeObject(game);
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void randomGame(boolean favFilter) {
		ArrayList<Game> gamePool = new ArrayList<Game>();
		for (Game game: gamesList) {
			if (game.isFav()) {
				gamePool.add(game);
			}
			else if (!favFilter) {
				gamePool.add(game);
			}
		}
		if (gamePool.size()== 0) gameToPlay = null;
		gameToPlay = gamePool.get((int) Math.floor(Math.random() * gamePool.size()));
	}
	
	public Game getGameToPlay() {
		return gameToPlay;
	}

}
