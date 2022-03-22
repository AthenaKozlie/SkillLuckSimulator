
public class Person implements Comparable{
	public double skill;
	public double luck;
	public double overall;
	public final double SCALE = 0.9999;
	public int ID;
	public Person(double s, double l, int I) {
		skill = s;
		luck = l;
		overall = (s * SCALE) + (l * (1 - SCALE));
		ID = I + 1;
	}

	@Override
	public int compareTo(Object comparestu) {
		 double compareOverall=((Person)comparestu).overall;
	        /* For Ascending order*/
	       // return this.overall-compareOverall;

	        /* For Descending order do like this */
	        return (int)((compareOverall - this.overall) * 100000000);
	}
	
	// Source: https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
	
	@Override
	public String toString() {
		return "Person ID # :: " + ID + "\nSkill :: " + this.skill + "\nLuck :: " + this.luck + "\nOverall :: " + this.overall;
	}
}
