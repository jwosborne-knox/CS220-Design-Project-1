import java.util.Arrays;

public class Class {
	private String className;
	private int[] statGrowthArray; // at every level stats grow by x amount as defined in this array in the order str, dex, vit, wis
								   // all data fed in would be with the 4 proper fields
	public Class(String className, int[] statGrowthArray) {
		super();
		this.className = className;
		this.statGrowthArray = statGrowthArray;
	}
	public String getClassName() {
		return className;
	}
	public int[] getStatGrowthArray() {
		return statGrowthArray;
	}
	@Override
	public String toString() {
		return "Class [className=" + className + ", statGrowthArray=" + Arrays.toString(statGrowthArray) + "]";
	}
	
}
