
import java.util.ArrayList;

class sample {
 public static void main(String args[])
 {
	  ArrayList<String> ara = new ArrayList();
	  ara.add("food");
	  ara.add("sleep");
	  ara.remove(0);
	  System.out.println(ara.size());
	  ara.remove("food");
	  System.out.println(ara.size());
 }
}
