
public class aDate {
	private int day;
	private int month;
	private int year;
	public aDate (int d, int m, int y) {
		day = d;
		month = m;
		year = y;
		System.out.printf("Constructing for %s\n", this); 
	}           //this keyword finds method toString
	
	public String toString () {
		return String.format("%02d/%02d/%02d", day, month, year);
	}
	
}
