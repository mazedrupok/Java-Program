
public class sample {
public static void main (String[] args) 
{
	System.out.println(average(2, 55, 34, 4));
}
public static int average (int...numbers) { //it can take any number of arguments
	int total = 0;
	for (int i : numbers) total += i;
	return total/numbers.length;
}
}
