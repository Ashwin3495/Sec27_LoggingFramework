import package1.Lec278_Package;
import package1.Lec281_AccessModifier;

public class Lec280_AccessModifier extends Lec281_AccessModifier{

	String name;	//Instance variable  - will be depended on the input of object  , does not rememeber last value
	String address;
	static String city;	//Static variable - will change as per input or will remain same 
									// Will remember the last value
	
	static int i;
	//Static block- where static variable can be initialized
	static {		
		city="Kalyan";
		i=25;
	}
	
	
	
	public void getDetails()
	{
		System.out.println(name+" "+city);
	}
	
	
	public static void main(String[] args) 
	{
		

		Lec278_Package cd=new Lec278_Package();	//Access new package and method 
		cd.abc();
		
		Lec280_AccessModifier a=new Lec280_AccessModifier(); //As the method is protected it can directly access method and we have used extends keyword
		a.getData();
		
		
	}
	
}
