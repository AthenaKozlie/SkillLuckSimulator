import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static final double SUCCESSFACTOR = 0.01;
	public static final double NUMPEOPLE = 1000000;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		for(int i = 0; i < NUMPEOPLE; i++) {
			double s = Math.random() * 100;
			double l = Math.random() * 100;
			people.add(new Person(s, l, i));
		}
		Collections.sort(people);
		
		//System.out.println("The average Skill of the top " + SUCCESSFACTOR * 100 + "% is" + getAverageSkill(people, SUCCESSFACTOR));
		//System.out.println("The average Luck of the top " + SUCCESSFACTOR * 100 + "% is" + getAverageLuck(people, SUCCESSFACTOR));
		System.out.println(0.0001 + "% :: [" + getAverageSkill(people, 0.000001) + ", " + getAverageLuck(people, 0.000001) + "]");
		System.out.println(0.001 + "% :: [" + getAverageSkill(people, 0.00001) + ", " + getAverageLuck(people, 0.00001) + "]");
		System.out.println(0.01 + "% :: [" + getAverageSkill(people, 0.0001) + ", " + getAverageLuck(people, 0.0001) + "]");
		System.out.println(0.1 + "% :: [" + getAverageSkill(people, 0.001) + ", " + getAverageLuck(people, 0.001) + "]");
		System.out.println(1 + "% :: [" + getAverageSkill(people, 0.01) + ", " + getAverageLuck(people, 0.01) + "]");
		System.out.println(2 + "% :: [" + getAverageSkill(people, 0.02) + ", " + getAverageLuck(people, 0.02) + "]");
		System.out.println(3 + "% :: [" + getAverageSkill(people, 0.03) + ", " + getAverageLuck(people, 0.03) + "]");
		System.out.println(4 + "% :: [" + getAverageSkill(people, 0.04) + ", " + getAverageLuck(people, 0.04) + "]");
		System.out.println(5 + "% :: [" + getAverageSkill(people, 0.05) + ", " + getAverageLuck(people, 0.05) + "]");
		System.out.println(6 + "% :: [" + getAverageSkill(people, 0.06) + ", " + getAverageLuck(people, 0.06) + "]");
		System.out.println(7 + "% :: [" + getAverageSkill(people, 0.07) + ", " + getAverageLuck(people, 0.07) + "]");
		System.out.println(8 + "% :: [" + getAverageSkill(people, 0.08) + ", " + getAverageLuck(people, 0.08) + "]");
		System.out.println(9 + "% :: [" + getAverageSkill(people, 0.09) + ", " + getAverageLuck(people, 0.09) + "]");
		System.out.println(10 + "% :: [" + getAverageSkill(people, 0.10) + ", " + getAverageLuck(people, 0.10) + "]");
		System.out.println(20 + "% :: [" + getAverageSkill(people, 0.20) + ", " + getAverageLuck(people, 0.20) + "]");
		System.out.println(30 + "% :: [" + getAverageSkill(people, 0.30) + ", " + getAverageLuck(people, 0.30) + "]");
		System.out.println(40 + "% :: [" + getAverageSkill(people, 0.40) + ", " + getAverageLuck(people, 0.40) + "]");
		System.out.println(50 + "% :: [" + getAverageSkill(people, 0.50) + ", " + getAverageLuck(people, 0.50) + "]");
		System.out.println(60 + "% :: [" + getAverageSkill(people, 0.60) + ", " + getAverageLuck(people, 0.60) + "]");
		System.out.println(70 + "% :: [" + getAverageSkill(people, 0.70) + ", " + getAverageLuck(people, 0.70) + "]");
		System.out.println(80 + "% :: [" + getAverageSkill(people, 0.80) + ", " + getAverageLuck(people, 0.80) + "]");
		System.out.println(90 + "% :: [" + getAverageSkill(people, 0.90) + ", " + getAverageLuck(people, 0.90) + "]");
		System.out.println(100 + "% :: [" + getAverageSkill(people, 1) + ", " + getAverageLuck(people, 1) + "]");
		
		System.out.println("\nHere's the list of the top 10 people :: ");
		
		printAll(people, 10);
	}
	
	public static double getAverageSkill(ArrayList<Person> p, double percentage) {
		double total = 0;
		for(int i = 0; i < (int)(p.size() * percentage); i++) {
			total += p.get(i).skill;
		}
		
		total = total / (int)(p.size() * percentage);
		
		return total;
	}
	
	public static double getAverageLuck(ArrayList<Person> p, double percentage) {
		double total = 0;
		for(int i = 0; i < (int)(p.size() * percentage); i++) {
			total += p.get(i).luck;
		}
		
		total = total / (int)(p.size() * percentage);
		
		return total;
	}
	
	public static void printPerson(Person p) {
		System.out.println(p);
	}
	
	public static void printAll(ArrayList<Person> p, int howMany) {
		for(int i = 0; i < howMany; i++) {
			printPerson(p.get(i));
		}
	}
}


