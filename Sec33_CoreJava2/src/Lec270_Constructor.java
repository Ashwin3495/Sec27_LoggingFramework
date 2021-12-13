
public class Lec270_Constructor {
	String name="Ashwin QA";
	public  Lec270_Constructor()
	
		{
			System.out.println(" I am in the constructor"); 
			System.out.println(" I am in the constructor lecture 1");  
		}
		// Parameterized constructor 
		
	public Lec270_Constructor(int a, int b) 
		{ 
			System.out.println(" I am in the parameterized constructor"); 
			int c=a+b; 
			System.out.println(c); 
		} 
		
		public Lec270_Constructor(String str) 
		{ 
			System.out.println(str); 
		}
		
		public void getdata() 
		{ 
			System.out.println("I am the method"); 
		} 
		//will not return values 
		//name of constructor should be the class name
		
	

		public static void main(String[] args) { // TODO Auto-generated method stub 
			Lec270_Constructor cd= new Lec270_Constructor(); 
			Lec270_Constructor cds= new Lec270_Constructor("hello"); 
			Lec270_Constructor c= new Lec270_Constructor(4,5); 
			
			// compiler will call implict constructor if you have not defined constructor block 
			//when ever you create an object constructor is called 
			//block of code when ever an object is created }

		}

}
