import java.util.Random;

public class sample {
public static void main (String[] args) 
{
	Random var = new Random ();
	int x;
	for (int i = 0; i < 10; i++) {
		x = 1 + var.nextInt(6); //takes 1 to 6 randomly
		System.out.println(x);
	}
	
}

}
