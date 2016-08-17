import java.util.Scanner;

class sample {
 public static void main(String args[])
 {
	 Scanner in = new Scanner(System.in);
	 String str = in.nextString();
	 String[] splite = str.split(" "); 
	 for (String st : splite) {
		 if (st.endsWith("ED")) {
			 System.out.println(st);
		 }
	 }
 }
}
