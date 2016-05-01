
public class people {
	private String name;
	private aDate birthday;
	public people (String a, aDate b) {
		name = a;
		birthday = b;
	}
	
	public String toString () {
		return String.format("My name is %s & Birthday is %s", name, birthday);
	}
	
}
