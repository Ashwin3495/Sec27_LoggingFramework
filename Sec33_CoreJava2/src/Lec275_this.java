import package1.Lec281_AccessModifier;

public class Lec275_this extends Lec276_Static  {

	
	public Lec275_this(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}

	int a=2;
	public void getData1()
	{
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(a+this.a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lec275_this c=new Lec275_this(name, city);
		c.getData1();
		c.getDetails();// Will not receive name as it is empty, whereas city value is Kalyan
		
		
		
		
		
	}

}
