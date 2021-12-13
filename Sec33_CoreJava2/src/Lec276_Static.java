import package1.Lec278_Package;

public class Lec276_Static {

	static String name;	//Instance variable  - will be depended on the input of object  , does not rememeber last value
	String address;
	static String city;	//Static variable - will change as per input or will remain same 
									// Will remember the last value
	
	static int i;
	//Static block- where static variable can be initialized
	static {		
		city="Kalyan";
		i=25;
	}
	
	public Lec276_Static(String name, String city)
	{
		this.name=name;		//local variable - Changes with every input
		this.city=city;
		i++;
	}
	
	public void getDetails()
	{
		System.out.println(name+" "+city);
	}
	
	
	public static void main(String[] args) 
	{
		Lec276_Static obj=new  Lec276_Static("Ashwin","Kalyan");
		Lec276_Static obj1=new  Lec276_Static("Ashwin","UK");
		obj.getDetails();
		obj1.getDetails();
		System.out.println(city);
		System.out.println(i);
		Lec276_Static.i=50;
		System.out.println(i);

		Lec278_Package cd=new Lec278_Package();
		cd.abc();
	}
	
}
