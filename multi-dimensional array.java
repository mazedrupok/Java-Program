
public class sample {
public static void main (String[] args) 
{
	int[][] first = {{11, 12, 13, 14}, {21, 22, 23, 24}};
	int second[][] = {{11, 12, 13, 14}, {21}, {31, 32, 33}};
	display (first);
	System.out.println();
	display (second);
}
public static void display (int[][] x) {
	for (int r = 0; r < x.length; r++) {
		for (int c = 0; c < x[r].length; c++) {
			System.out.print(x[r][c] + "\t");
		}
		System.out.println();
	}
}
}
