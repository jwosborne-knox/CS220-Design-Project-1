import java.util.HashMap;

public class Player {
	private HashMap<String, Achievement> achievements; //only stores the 10 most recent 
	private String username;
	private Class playerClass; //class defines how stats grow after each level
	private int level;
	private int str;
	private int dex;
	private int vit;
	private int wis;
	private int exp; //total exp, after certain points will trigger level
	public Player(String username, Class playerClass) {
		super();
		this.username = username;
		this.playerClass = playerClass;
		achievements = new HashMap<String, Achievement>();
		level = 1;
		exp = 0;
		str = 10;
		dex = 10;
		vit = 10;
		wis = 10;
	}
	public String getUsername() {
		return username;
	}
	public Class getPlayerClass() {
		return playerClass;
	}
	public int getLevel() {
		return level;
	}
	public int getStr() {
		return str;
	}
	public int getDex() {
		return dex;
	}
	public int getVit() {
		return vit;
	}
	public int getWis() {
		return wis;
	}
	public void addAchievement(Achievement achievement) {
		if(!hasAchievement(achievement.getAchievementName())) {
			achievements.put(achievement.getAchievementName(), achievement);
		}
	}
	public void raiseExp(int exp) {
		this.exp += exp;
		chkLvUp();
	}
	public boolean hasAchievement(String achievement) {
		return achievements.containsKey(achievement);
	}
	
	public void aquireAchievement(Achievement achievement) {
		if(achievements.get(achievement.getAchievementName()).equals(achievement) == false) {
			achievements.put(achievement.getAchievementName(), achievement);
			str += achievement.getStatGrowthArray()[0];
			dex += achievement.getStatGrowthArray()[1];
			vit += achievement.getStatGrowthArray()[2];
			wis += achievement.getStatGrowthArray()[3];
		}
	}
	private void chkLvUp() { //checks if the level grew as following the growth formula below, just borrowing the DND 3.5 one
		if(exp >= psuedoFactorial(level) * 100) {
			level++;
			str += playerClass.getStatGrowthArray()[0];
			dex += playerClass.getStatGrowthArray()[1];
			vit += playerClass.getStatGrowthArray()[2];
			wis += playerClass.getStatGrowthArray()[3];
		}
	}
	private int psuedoFactorial(int x) { //does a psuedofactorial based on addition as opposed to multiplucation
		if(x <= 0)
			return 0;
		return x + psuedoFactorial(x--);
	}
}
