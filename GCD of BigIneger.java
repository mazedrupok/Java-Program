import java.math.BigInteger;
import java.util.Scanner;

public class sample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		BigInteger val1 = s.nextBigInteger();
		BigInteger val2 = s.nextBigInteger();
		s.close();

		BigInteger gcd = val1.gcd(val2);
		System.out.println(gcd);
		System.out.println(val1);
	}

}
