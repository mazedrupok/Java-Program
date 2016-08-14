
public class people {
	private int sum;
	private final int num;
	public people (int x) {
		num = x;
	}
	public void Add () {
		sum += num;
	}
	public int getData () {
		return num;
	}
	public String toString () {
		return String.format("Total is: %d\n", sum);
	}
}
