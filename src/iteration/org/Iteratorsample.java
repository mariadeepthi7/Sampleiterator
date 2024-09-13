package iteration.org;
import java.util.Vector;
public class Iteratorsample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v =new Vector();
		v.add("The");
		v.add("world");
		v.add("is");
		v.add("beautiful");
		v.add("Enjoy every movement");
		v.add("Life is Unpredictable Be Happy Always ");
		java.util.Iterator<String> i = v.iterator();
		while (i.hasNext()) {
			String n =  i.next();
			System.out.println(n);
			if (n.equals("world")) {
				i.remove();
				
			}
			
		}
		System.out.println(v);
	}

}
