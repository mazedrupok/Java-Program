import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

public class sample {

	public static void main(String[] args) {
		System.out.println("Average of numbers: " + avg(2,4,9,1));
	}
	public static int avg (int...numbers) {
		int total = 0;
		for (int x: numbers) {
			total += x;
		}
		total = total /numbers.length;
		return total;
	}

}
