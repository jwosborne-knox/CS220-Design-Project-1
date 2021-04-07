import java.util.HashMap;

public class PlayerTracker {
	HashMap<String, Player> playerMap = new HashMap<String, Player>();
	public void addNewPlayer(Player player) {
		playerMap.put(player.getUsername(), player);
	}
	public Player getPlayer(String username) {
		return playerMap.get(username);
	}
	public int getPlayerlevel(String username) {	
		return (playerMap.get(username)).getLevel();
	}
	public String getPlayerClass(String username) {
		return playerMap.get(username).getClass().toString();
	}
	public boolean hasAchievement(String username, String achievement) {//returns true if they have a given achievement
		return playerMap.get(username).hasAchievement(achievement);
	}
	public void addAchievement(String username, Achievement achievement) {
		playerMap.get(username).addAchievement(achievement);
	}
}
