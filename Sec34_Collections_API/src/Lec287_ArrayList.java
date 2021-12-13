import java.util.ArrayList;

public class Lec287_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ashwin");
		a.add(0, "Dinesh");
		a.add("Vijay");
		//a.remove(0);
		
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("Ashwin"));
		System.out.println(a.indexOf("Ashwin"));
		System.out.println(a.isEmpty());
	
	}

}
