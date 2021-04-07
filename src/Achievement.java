import java.util.Arrays;

public class Achievement {
	private String achievementName;
	private int[] statGrowthArray; //one time stat growth from the achievement, still 4 values in the same order as in Class
	public Achievement(String achievementName, int[] statGrowthArray) {
		super();
		this.achievementName = achievementName;
		this.statGrowthArray = statGrowthArray;
	}
	public String getAchievementName() {
		return achievementName;
	}
	public int[] getStatGrowthArray() {
		return statGrowthArray;
	}
	@Override
	public String toString() {
		return "Achievement [achievementName=" + achievementName + ", statGrowthArray="
				+ Arrays.toString(statGrowthArray) + "]";
	}
}
