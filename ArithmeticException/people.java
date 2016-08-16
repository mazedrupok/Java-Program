
public class people {
	public int x = 10;
	
	public void func () {
		try {
			int d = 0;
			d = x / d;
			System.out.println ("HEllo"); //This not executed
		}
		catch (ArithmeticException e) {  //toString() method is overriden
			System.out.println("Devide by zero " + e);
		}
	}
}
