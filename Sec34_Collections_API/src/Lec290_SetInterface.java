import java.util.HashSet;
import java.util.Iterator;

public class Lec290_SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("USA");
		hs.add("Austria");
		hs.add("Japan");
		hs.add("Japan");	//Duplicate values cannot be added
		System.out.println(hs);
		
		Iterator <String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
